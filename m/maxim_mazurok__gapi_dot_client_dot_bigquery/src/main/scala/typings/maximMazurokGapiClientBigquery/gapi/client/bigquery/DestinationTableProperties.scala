package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationTableProperties extends js.Object {
  
  /**
    * [Optional] The description for the destination table. This will only be used if the destination table is newly created. If the table already exists and a value different than the
    * current description is provided, the job will fail.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The friendly name for the destination table. This will only be used if the destination table is newly created. If the table already exists and a value different than the
    * current friendly name is provided, the job will fail.
    */
  var friendlyName: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The labels associated with this table. You can use these to organize and group your tables. This will only be used if the destination table is newly created. If the table
    * already exists and labels are different than the current labels are provided, the job will fail.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.DestinationTableProperties with TopLevel[js.Any]
  ] = js.native
}
object DestinationTableProperties {
  
  @scala.inline
  def apply(): DestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationTableProperties]
  }
  
  @scala.inline
  implicit class DestinationTablePropertiesOps[Self <: DestinationTableProperties] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.DestinationTableProperties with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
}
