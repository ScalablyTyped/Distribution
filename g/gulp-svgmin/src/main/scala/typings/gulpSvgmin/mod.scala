package typings.gulpSvgmin

import typings.node.streamMod.Transform
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(
    cb: js.Function1[
      /* file */ File, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SVGO.Options */ Any
    ]
  ): Transform = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SVGO.Options */ Any
  ): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-svgmin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
