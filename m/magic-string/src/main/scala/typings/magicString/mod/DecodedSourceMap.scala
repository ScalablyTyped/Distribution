package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodedSourceMap extends js.Object {
  
  var file: String = js.native
  
  var mappings: js.Array[js.Array[SourceMapSegment]] = js.native
  
  var names: js.Array[String] = js.native
  
  var sources: js.Array[String] = js.native
  
  var sourcesContent: js.Array[String] = js.native
}
object DecodedSourceMap {
  
  @scala.inline
  def apply(
    file: String,
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    sourcesContent: js.Array[String]
  ): DecodedSourceMap = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedSourceMap]
  }
  
  @scala.inline
  implicit class DecodedSourceMapOps[Self <: DecodedSourceMap] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingsVarargs(value: js.Array[SourceMapSegment]*): Self = this.set("mappings", js.Array(value :_*))
    
    @scala.inline
    def setMappings(value: js.Array[js.Array[SourceMapSegment]]): Self = this.set("mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesContentVarargs(value: String*): Self = this.set("sourcesContent", js.Array(value :_*))
    
    @scala.inline
    def setSourcesContent(value: js.Array[String]): Self = this.set("sourcesContent", value.asInstanceOf[js.Any])
  }
}
