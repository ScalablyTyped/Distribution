package typings.loadableServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkExtractorManagerProps extends js.Object {
  
  var extractor: ChunkExtractor = js.native
}
object ChunkExtractorManagerProps {
  
  @scala.inline
  def apply(extractor: ChunkExtractor): ChunkExtractorManagerProps = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkExtractorManagerProps]
  }
  
  @scala.inline
  implicit class ChunkExtractorManagerPropsOps[Self <: ChunkExtractorManagerProps] (val x: Self) extends AnyVal {
    
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
    def setExtractor(value: ChunkExtractor): Self = this.set("extractor", value.asInstanceOf[js.Any])
  }
}
