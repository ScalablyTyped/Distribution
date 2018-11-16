package typings
package imperiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object imperiumLibStrings {
  @js.native
  sealed trait body extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait params extends js.Object
  
  @js.native
  sealed trait query extends js.Object
  
  def body: body = "body".asInstanceOf[body]
  def headers: headers = "headers".asInstanceOf[headers]
  def params: params = "params".asInstanceOf[params]
  def query: query = "query".asInstanceOf[query]
}

