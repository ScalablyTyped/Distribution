package typings.httpStatus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpStatusNginx extends js.Object {
  val `444`: String = js.native
  val `444_CLASS`: String = js.native
  val `444_MESSAGE`: String = js.native
  val `444_NAME`: String = js.native
  val `494`: String = js.native
  val `494_CLASS`: String = js.native
  val `494_MESSAGE`: String = js.native
  val `494_NAME`: String = js.native
  val `495`: String = js.native
  val `495_CLASS`: String = js.native
  val `495_MESSAGE`: String = js.native
  val `495_NAME`: String = js.native
  val `496`: String = js.native
  val `496_CLASS`: String = js.native
  val `496_MESSAGE`: String = js.native
  val `496_NAME`: String = js.native
  val `497`: String = js.native
  val `497_CLASS`: String = js.native
  val `497_MESSAGE`: String = js.native
  val `497_NAME`: String = js.native
  val `499`: String = js.native
  val `499_CLASS`: String = js.native
  val `499_MESSAGE`: String = js.native
  val `499_NAME`: String = js.native
  val CLIENT_CLOSED_REQUEST: Double = js.native
  val HTTP_REQUEST_SENT_TO_HTTPS_PORT: Double = js.native
  val NO_RESPONSE: Double = js.native
  val REQUEST_HEADER_TOO_LARGE: Double = js.native
  val SSL_CERTIFICATE_ERROR: Double = js.native
  val SSL_CERTIFICATE_REQUIRED: Double = js.native
}

object HttpStatusNginx {
  @scala.inline
  def apply(
    `444`: String,
    `444_CLASS`: String,
    `444_MESSAGE`: String,
    `444_NAME`: String,
    `494`: String,
    `494_CLASS`: String,
    `494_MESSAGE`: String,
    `494_NAME`: String,
    `495`: String,
    `495_CLASS`: String,
    `495_MESSAGE`: String,
    `495_NAME`: String,
    `496`: String,
    `496_CLASS`: String,
    `496_MESSAGE`: String,
    `496_NAME`: String,
    `497`: String,
    `497_CLASS`: String,
    `497_MESSAGE`: String,
    `497_NAME`: String,
    `499`: String,
    `499_CLASS`: String,
    `499_MESSAGE`: String,
    `499_NAME`: String,
    CLIENT_CLOSED_REQUEST: Double,
    HTTP_REQUEST_SENT_TO_HTTPS_PORT: Double,
    NO_RESPONSE: Double,
    REQUEST_HEADER_TOO_LARGE: Double,
    SSL_CERTIFICATE_ERROR: Double,
    SSL_CERTIFICATE_REQUIRED: Double
  ): HttpStatusNginx = {
    val __obj = js.Dynamic.literal(CLIENT_CLOSED_REQUEST = CLIENT_CLOSED_REQUEST.asInstanceOf[js.Any], HTTP_REQUEST_SENT_TO_HTTPS_PORT = HTTP_REQUEST_SENT_TO_HTTPS_PORT.asInstanceOf[js.Any], NO_RESPONSE = NO_RESPONSE.asInstanceOf[js.Any], REQUEST_HEADER_TOO_LARGE = REQUEST_HEADER_TOO_LARGE.asInstanceOf[js.Any], SSL_CERTIFICATE_ERROR = SSL_CERTIFICATE_ERROR.asInstanceOf[js.Any], SSL_CERTIFICATE_REQUIRED = SSL_CERTIFICATE_REQUIRED.asInstanceOf[js.Any])
    __obj.updateDynamic("444")(`444`.asInstanceOf[js.Any])
    __obj.updateDynamic("444_CLASS")(`444_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("444_MESSAGE")(`444_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("444_NAME")(`444_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("494")(`494`.asInstanceOf[js.Any])
    __obj.updateDynamic("494_CLASS")(`494_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("494_MESSAGE")(`494_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("494_NAME")(`494_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("495")(`495`.asInstanceOf[js.Any])
    __obj.updateDynamic("495_CLASS")(`495_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("495_MESSAGE")(`495_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("495_NAME")(`495_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("496")(`496`.asInstanceOf[js.Any])
    __obj.updateDynamic("496_CLASS")(`496_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("496_MESSAGE")(`496_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("496_NAME")(`496_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("497")(`497`.asInstanceOf[js.Any])
    __obj.updateDynamic("497_CLASS")(`497_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("497_MESSAGE")(`497_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("497_NAME")(`497_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("499")(`499`.asInstanceOf[js.Any])
    __obj.updateDynamic("499_CLASS")(`499_CLASS`.asInstanceOf[js.Any])
    __obj.updateDynamic("499_MESSAGE")(`499_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("499_NAME")(`499_NAME`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatusNginx]
  }
  @scala.inline
  implicit class HttpStatusNginxOps[Self <: HttpStatusNginx] (val x: Self) extends AnyVal {
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
    def set444(value: String): Self = this.set("444", value.asInstanceOf[js.Any])
    @scala.inline
    def set444_CLASS(value: String): Self = this.set("444_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def set444_MESSAGE(value: String): Self = this.set("444_MESSAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def set444_NAME(value: String): Self = this.set("444_NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def set494(value: String): Self = this.set("494", value.asInstanceOf[js.Any])
    @scala.inline
    def set494_CLASS(value: String): Self = this.set("494_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def set494_MESSAGE(value: String): Self = this.set("494_MESSAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def set494_NAME(value: String): Self = this.set("494_NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def set495(value: String): Self = this.set("495", value.asInstanceOf[js.Any])
    @scala.inline
    def set495_CLASS(value: String): Self = this.set("495_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def set495_MESSAGE(value: String): Self = this.set("495_MESSAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def set495_NAME(value: String): Self = this.set("495_NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def set496(value: String): Self = this.set("496", value.asInstanceOf[js.Any])
    @scala.inline
    def set496_CLASS(value: String): Self = this.set("496_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def set496_MESSAGE(value: String): Self = this.set("496_MESSAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def set496_NAME(value: String): Self = this.set("496_NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def set497(value: String): Self = this.set("497", value.asInstanceOf[js.Any])
    @scala.inline
    def set497_CLASS(value: String): Self = this.set("497_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def set497_MESSAGE(value: String): Self = this.set("497_MESSAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def set497_NAME(value: String): Self = this.set("497_NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def set499(value: String): Self = this.set("499", value.asInstanceOf[js.Any])
    @scala.inline
    def set499_CLASS(value: String): Self = this.set("499_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def set499_MESSAGE(value: String): Self = this.set("499_MESSAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def set499_NAME(value: String): Self = this.set("499_NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIENT_CLOSED_REQUEST(value: Double): Self = this.set("CLIENT_CLOSED_REQUEST", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTTP_REQUEST_SENT_TO_HTTPS_PORT(value: Double): Self = this.set("HTTP_REQUEST_SENT_TO_HTTPS_PORT", value.asInstanceOf[js.Any])
    @scala.inline
    def setNO_RESPONSE(value: Double): Self = this.set("NO_RESPONSE", value.asInstanceOf[js.Any])
    @scala.inline
    def setREQUEST_HEADER_TOO_LARGE(value: Double): Self = this.set("REQUEST_HEADER_TOO_LARGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSSL_CERTIFICATE_ERROR(value: Double): Self = this.set("SSL_CERTIFICATE_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSSL_CERTIFICATE_REQUIRED(value: Double): Self = this.set("SSL_CERTIFICATE_REQUIRED", value.asInstanceOf[js.Any])
  }
  
}

