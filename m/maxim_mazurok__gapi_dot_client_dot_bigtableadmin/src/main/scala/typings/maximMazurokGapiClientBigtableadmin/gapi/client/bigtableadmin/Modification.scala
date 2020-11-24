package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modification extends js.Object {
  
  /** Create a new column family with the specified schema, or fail if one already exists with the given ID. */
  var create: js.UndefOr[ColumnFamily] = js.native
  
  /** Drop (delete) the column family with the given ID, or fail if no such family exists. */
  var drop: js.UndefOr[Boolean] = js.native
  
  /** The ID of the column family to be modified. */
  var id: js.UndefOr[String] = js.native
  
  /** Update an existing column family to the specified schema, or fail if no column family exists with the given ID. */
  var update: js.UndefOr[ColumnFamily] = js.native
}
object Modification {
  
  @scala.inline
  def apply(): Modification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modification]
  }
  
  @scala.inline
  implicit class ModificationOps[Self <: Modification] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: ColumnFamily): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDrop(value: Boolean): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setUpdate(value: ColumnFamily): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
