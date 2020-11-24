package typings.jestHasteMap.anon

import typings.jestHasteMap.jestHasteMapNumbers.`0`
import typings.jestHasteMap.jestHasteMapNumbers.`1`
import typings.jestHasteMap.typesMod.InternalHasteMap
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedFiles extends js.Object {
  
  var changedFiles: js.UndefOr[
    Map[
      String, 
      js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
    ]
  ] = js.native
  
  var hasteMap: InternalHasteMap = js.native
  
  var removedFiles: Map[
    String, 
    js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
  ] = js.native
}
object ChangedFiles {
  
  @scala.inline
  def apply(
    hasteMap: InternalHasteMap,
    removedFiles: Map[
      String, 
      js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
    ]
  ): ChangedFiles = {
    val __obj = js.Dynamic.literal(hasteMap = hasteMap.asInstanceOf[js.Any], removedFiles = removedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedFiles]
  }
  
  @scala.inline
  implicit class ChangedFilesOps[Self <: ChangedFiles] (val x: Self) extends AnyVal {
    
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
    def setHasteMap(value: InternalHasteMap): Self = this.set("hasteMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedFiles(
      value: Map[
          String, 
          js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
        ]
    ): Self = this.set("removedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedFiles(
      value: Map[
          String, 
          js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
        ]
    ): Self = this.set("changedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedFiles: Self = this.set("changedFiles", js.undefined)
  }
}
