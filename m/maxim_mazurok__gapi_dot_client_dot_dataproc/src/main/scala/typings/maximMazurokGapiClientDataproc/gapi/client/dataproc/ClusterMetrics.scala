package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMetrics extends js.Object {
  
  /** The HDFS metrics. */
  var hdfsMetrics: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterMetrics with TopLevel[js.Any]
  ] = js.native
  
  /** The YARN metrics. */
  var yarnMetrics: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterMetrics with TopLevel[js.Any]
  ] = js.native
}
object ClusterMetrics {
  
  @scala.inline
  def apply(): ClusterMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMetrics]
  }
  
  @scala.inline
  implicit class ClusterMetricsOps[Self <: ClusterMetrics] (val x: Self) extends AnyVal {
    
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
    def setHdfsMetrics(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterMetrics with TopLevel[js.Any]
    ): Self = this.set("hdfsMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHdfsMetrics: Self = this.set("hdfsMetrics", js.undefined)
    
    @scala.inline
    def setYarnMetrics(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterMetrics with TopLevel[js.Any]
    ): Self = this.set("yarnMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYarnMetrics: Self = this.set("yarnMetrics", js.undefined)
  }
}
