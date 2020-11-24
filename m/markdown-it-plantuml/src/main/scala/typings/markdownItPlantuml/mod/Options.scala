package typings.markdownItPlantuml.mod

import typings.markdownIt.rendererMod.RenderRule
import typings.markdownIt.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var closeMarker: js.UndefOr[String] = js.native
  
  var diagramName: js.UndefOr[String] = js.native
  
  var generateSource: js.UndefOr[js.Function2[/* umlCode */ String, /* pluginOptions */ this.type, String]] = js.native
  
  var imageFormat: js.UndefOr[String] = js.native
  
  var openMarker: js.UndefOr[String] = js.native
  
  var render: js.UndefOr[RenderRule] = js.native
  
  var server: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloseMarker(value: String): Self = this.set("closeMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseMarker: Self = this.set("closeMarker", js.undefined)
    
    @scala.inline
    def setDiagramName(value: String): Self = this.set("diagramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagramName: Self = this.set("diagramName", js.undefined)
    
    @scala.inline
    def setGenerateSource(value: (/* umlCode */ String, Options) => String): Self = this.set("generateSource", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGenerateSource: Self = this.set("generateSource", js.undefined)
    
    @scala.inline
    def setImageFormat(value: String): Self = this.set("imageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFormat: Self = this.set("imageFormat", js.undefined)
    
    @scala.inline
    def setOpenMarker(value: String): Self = this.set("openMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenMarker: Self = this.set("openMarker", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ typings.markdownIt.libMod.Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("render", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
}
