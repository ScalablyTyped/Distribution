package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificates extends js.Object {
  /** chained CA certificates */
  var ca: js.Array[String | Buffer]
  /** public certificate */
  var cert: String | Buffer
  /** private key file */
  var key: String | Buffer
}

object Certificates {
  @scala.inline
  def apply(ca: js.Array[String | Buffer], cert: String | Buffer, key: String | Buffer): Certificates = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Certificates]
  }
}

