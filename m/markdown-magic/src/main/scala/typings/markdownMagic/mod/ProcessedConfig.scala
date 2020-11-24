package typings.markdownMagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessedConfig extends Configuration {
  
  val originalPath: String = js.native
  
  val outputContent: String = js.native
  
  @JSName("outputDir")
  val outputDir_ProcessedConfig: String = js.native
  
  val outputFilePath: String = js.native
}
object ProcessedConfig {
  
  @scala.inline
  def apply(originalPath: String, outputContent: String, outputDir: String, outputFilePath: String): ProcessedConfig = {
    val __obj = js.Dynamic.literal(originalPath = originalPath.asInstanceOf[js.Any], outputContent = outputContent.asInstanceOf[js.Any], outputDir = outputDir.asInstanceOf[js.Any], outputFilePath = outputFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedConfig]
  }
  
  @scala.inline
  implicit class ProcessedConfigOps[Self <: ProcessedConfig] (val x: Self) extends AnyVal {
    
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
    def setOriginalPath(value: String): Self = this.set("originalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContent(value: String): Self = this.set("outputContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDir(value: String): Self = this.set("outputDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFilePath(value: String): Self = this.set("outputFilePath", value.asInstanceOf[js.Any])
  }
}
