package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon8[T] extends js.Object {
  def failure(bucket: KiiBucket, anErrorString: String): js.Any
  def success(queryPerformed: KiiQuery, resultSet: js.Array[T], nextQuery: KiiQuery): js.Any
}

object Anon8 {
  @scala.inline
  def apply[T](failure: (KiiBucket, String) => js.Any, success: (KiiQuery, js.Array[T], KiiQuery) => js.Any): Anon8[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[Anon8[T]]
  }
}

