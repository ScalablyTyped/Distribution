package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source information used to create a Service Config
  */
@js.native
trait SchemaSourceInfo extends js.Object {
  /**
    * All files used during config generation.
    */
  var sourceFiles: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object SchemaSourceInfo {
  @scala.inline
  def apply(): SchemaSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceInfo]
  }
  @scala.inline
  implicit class SchemaSourceInfoOps[Self <: SchemaSourceInfo] (val x: Self) extends AnyVal {
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
    def setSourceFilesVarargs(value: StringDictionary[js.Any]*): Self = this.set("sourceFiles", js.Array(value :_*))
    @scala.inline
    def setSourceFiles(value: js.Array[StringDictionary[_]]): Self = this.set("sourceFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFiles: Self = this.set("sourceFiles", js.undefined)
  }
  
}

