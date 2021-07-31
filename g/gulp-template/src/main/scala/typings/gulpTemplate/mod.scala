package typings.gulpTemplate

import typings.lodash.mod.TemplateOptions
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(data: js.Any, options: TemplateOptions): Transform = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  @JSImport("gulp-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def precompile(options: TemplateOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("precompile")(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
