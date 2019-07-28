package typings.ipify.ipifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Get your public IP address.
  @returns An IP address.
  @example
  ```
  import ipify = require('ipify');
  (async () => {
  	console.log(await ipify());
  	//=> '2001:0db8:85a3:0000:0000:8a2e:0370:7334'
  	console.log(await ipify({useIPv6: false});
  	//=> '82.142.31.236'
  })();
  ```
  */
  def apply(): js.Promise[String] = js.native
  def apply(options: Options): js.Promise[String] = js.native
}

