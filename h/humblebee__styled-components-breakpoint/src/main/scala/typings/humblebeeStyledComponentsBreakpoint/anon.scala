package typings.humblebeeStyledComponentsBreakpoint

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Down extends StObject {
    
    /**
      * Will return a media query with a max-width of the defined breakpoint
      * @example "@media only screen and (max-width: ____px)"
      * @widthKey max width
      */
    def down(widthKey: String): js.Function2[
        /* first */ TemplateStringsArray | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any), 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleInterpolation */ /* repeated */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_styled-components.FlattenSimpleInterpolation */ Any
      ] = js.native
    
    var list: js.Array[String] = js.native
    
    /**
      * For one parameter:
      * Will return a range media query between "widthKey" and the next upper breakpoint
      * @example "@media only screen and (min-width: ____px) and (max-width: _next_upper_px)"
      *
      * For two parameters:
      * Will return a range media query between "widthKey" and "boundKey"
      * @example "@media only screen and (min-width: ____px) and (max-width: _next_upper_px)"
      *
      * @widthKey min width
      * @boundKey max width, optional (if missing, next higher than min width)
      */
    def only(widthKey: String): js.Function2[
        /* first */ TemplateStringsArray | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any), 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleInterpolation */ /* repeated */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_styled-components.FlattenSimpleInterpolation */ Any
      ] = js.native
    def only(widthKey: String, boundKey: String): js.Function2[
        /* first */ TemplateStringsArray | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any), 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleInterpolation */ /* repeated */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_styled-components.FlattenSimpleInterpolation */ Any
      ] = js.native
    
    /**
      * Will return a media query with a min-width of the defined breakpoint
      * @example "@media only screen and (min-width: ____px)"
      * @widthKey min width
      */
    def up(widthKey: String): js.Function2[
        /* first */ TemplateStringsArray | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any), 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleInterpolation */ /* repeated */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_styled-components.FlattenSimpleInterpolation */ Any
      ] = js.native
  }
}
