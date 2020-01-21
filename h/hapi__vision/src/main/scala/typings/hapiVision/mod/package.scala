package typings.hapiVision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
    /* template */ java.lang.String, 
    /* context */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[typings.hapiVision.mod.ServerViewsConfiguration], 
    js.Promise[java.lang.String]
  ]
  type RuntimeOptions = js.Object
  type ServerViewCompile = typings.hapiVision.mod.ServerViewCompileSync | typings.hapiVision.mod.ServerViewCompileAsync
  type ServerViewCompileAsync = js.Function3[
    /* template */ java.lang.String, 
    /* options */ js.Any, 
    /* next */ typings.hapiVision.mod.ServerViewCompileNext, 
    scala.Unit
  ]
  type ServerViewCompileNext = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* compiled */ js.Function3[
      /* context */ js.Any, 
      /* options */ js.Any, 
      /* callback */ js.Function2[
        /* err */ scala.Null | typings.std.Error, 
        /* rendered */ java.lang.String | scala.Null, 
        scala.Unit
      ], 
      scala.Unit
    ], 
    scala.Unit
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
    /* template */ java.lang.String, 
    /* options */ js.Any, 
    js.Function2[/* context */ js.Any, /* options */ js.Any, scala.Unit]
  ]
}
