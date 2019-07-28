package typings.atHapiVision

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiVisionMod {
  /**
    * Options passed to module when compiling template.
    * Cast your options to this interface or extend it with:
    *      declare module '@hapi/hapi' {
    *          interface CompileOptions {
    *              noEscape: boolean;
    *          }
    *      }
    */
  type CompileOptions = js.Object
  type EngineConfigurationObject = js.Object
  /**
    * Renders a template
    * @param template - the template filename and path, relative to the views manager templates path (path or relativeTo).
    * @param context - optional object used by the template to render context-specific result. Defaults to no context ({}).
    * @param options - optional object used to override the views manager configuration.
    */
  type RenderMethod = js.Function3[
    /* template */ String, 
    /* context */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[ServerViewsConfiguration], 
    js.Promise[String]
  ]
  type RuntimeOptions = js.Object
  type ServerViewCompile = ServerViewCompileSync | ServerViewCompileAsync
  type ServerViewCompileAsync = js.Function3[/* template */ String, /* options */ js.Any, /* next */ ServerViewCompileNext, Unit]
  type ServerViewCompileNext = js.Function2[
    /* err */ Error | Null, 
    /* compiled */ js.Function3[
      /* context */ js.Any, 
      /* options */ js.Any, 
      /* callback */ js.Function2[/* err */ Null | Error, /* rendered */ String | Null, Unit], 
      Unit
    ], 
    Unit
  ]
  /**
    * The rendering function. The required function signature depends on the compileMode settings (see below).
    *
    * If compileMode is 'sync', the signature is compile(template, options),
    * the return value is a function with signature function(context, options) (the compiled sync template),
    * and the method is allowed to throw errors.
    *
    * If compileMode is 'async',
    * the signature is compile(template, options, next) where next has the signature function(err, compiled),
    * compiled is a function with signature function(context, options, callback) (the compiled async template)
    * and callback has the signature function(err, rendered).
    */
  type ServerViewCompileSync = js.Function2[
    /* template */ String, 
    /* options */ js.Any, 
    js.Function2[/* context */ js.Any, /* options */ js.Any, Unit]
  ]
}
