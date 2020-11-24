package typings.jestHasteMap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerMessage extends js.Object {
  
  var computeDependencies: Boolean = js.native
  
  var computeSha1: Boolean = js.native
  
  var dependencyExtractor: js.UndefOr[String] = js.native
  
  var filePath: String = js.native
  
  var hasteImplModulePath: js.UndefOr[String] = js.native
  
  var rootDir: String = js.native
}
object WorkerMessage {
  
  @scala.inline
  def apply(computeDependencies: Boolean, computeSha1: Boolean, filePath: String, rootDir: String): WorkerMessage = {
    val __obj = js.Dynamic.literal(computeDependencies = computeDependencies.asInstanceOf[js.Any], computeSha1 = computeSha1.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerMessage]
  }
  
  @scala.inline
  implicit class WorkerMessageOps[Self <: WorkerMessage] (val x: Self) extends AnyVal {
    
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
    def setComputeDependencies(value: Boolean): Self = this.set("computeDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeSha1(value: Boolean): Self = this.set("computeSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyExtractor(value: String): Self = this.set("dependencyExtractor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencyExtractor: Self = this.set("dependencyExtractor", js.undefined)
    
    @scala.inline
    def setHasteImplModulePath(value: String): Self = this.set("hasteImplModulePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasteImplModulePath: Self = this.set("hasteImplModulePath", js.undefined)
  }
}
