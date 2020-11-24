package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A session in the Cloud Spanner API.
  */
@js.native
trait SchemaSession extends js.Object {
  
  /**
    * Output only. The approximate timestamp when the session is last used. It
    * is typically earlier than the actual last use time.
    */
  var approximateLastUseTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The timestamp when the session is created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The labels for the session.   * Label keys must be between 1 and 63
    * characters long and must conform to    the following regular expression:
    * `[a-z]([-a-z0-9]*[a-z0-9])?`.  * Label values must be between 0 and 63
    * characters long and must conform    to the regular expression
    * `([a-z]([-a-z0-9]*[a-z0-9])?)?`.  * No more than 64 labels can be
    * associated with a given session.  See https://goo.gl/xmQnxf for more
    * information on and examples of labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The name of the session. This is always system-assigned; values provided
    * when creating a session are ignored.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaSession {
  
  @scala.inline
  def apply(): SchemaSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSession]
  }
  
  @scala.inline
  implicit class SchemaSessionOps[Self <: SchemaSession] (val x: Self) extends AnyVal {
    
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
    def setApproximateLastUseTime(value: String): Self = this.set("approximateLastUseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproximateLastUseTime: Self = this.set("approximateLastUseTime", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
