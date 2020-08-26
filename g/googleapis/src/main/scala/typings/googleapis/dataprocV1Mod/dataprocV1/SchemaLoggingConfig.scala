package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The runtime logging config of the job.
  */
@js.native
trait SchemaLoggingConfig extends js.Object {
  /**
    * The per-package log levels for the driver. This may include
    * &quot;root&quot; package name to configure rootLogger. Examples:
    * &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache =
    * DEBUG&#39;
    */
  var driverLogLevels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaLoggingConfig {
  @scala.inline
  def apply(): SchemaLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingConfig]
  }
  @scala.inline
  implicit class SchemaLoggingConfigOps[Self <: SchemaLoggingConfig] (val x: Self) extends AnyVal {
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
    def setDriverLogLevels(value: StringDictionary[String]): Self = this.set("driverLogLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriverLogLevels: Self = this.set("driverLogLevels", js.undefined)
  }
  
}

