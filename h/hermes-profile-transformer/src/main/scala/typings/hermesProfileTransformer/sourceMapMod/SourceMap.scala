package typings.hermesProfileTransformer.sourceMapMod

import typings.hermesProfileTransformer.anon.Mappings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMap extends js.Object {
  
  var mappings: String = js.native
  
  var names: js.Array[String] = js.native
  
  var sourceContent: js.Array[String] = js.native
  
  var sources: js.Array[String] = js.native
  
  var version: String = js.native
  
  var x_facebook_sources: js.Array[Mappings] | Null = js.native
}
object SourceMap {
  
  @scala.inline
  def apply(
    mappings: String,
    names: js.Array[String],
    sourceContent: js.Array[String],
    sources: js.Array[String],
    version: String
  ): SourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sourceContent = sourceContent.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMap]
  }
  
  @scala.inline
  implicit class SourceMapOps[Self <: SourceMap] (val x: Self) extends AnyVal {
    
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
    def setMappings(value: String): Self = this.set("mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceContentVarargs(value: String*): Self = this.set("sourceContent", js.Array(value :_*))
    
    @scala.inline
    def setSourceContent(value: js.Array[String]): Self = this.set("sourceContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_facebook_sourcesVarargs(value: Mappings*): Self = this.set("x_facebook_sources", js.Array(value :_*))
    
    @scala.inline
    def setX_facebook_sources(value: js.Array[Mappings]): Self = this.set("x_facebook_sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_facebook_sourcesNull: Self = this.set("x_facebook_sources", null)
  }
}
