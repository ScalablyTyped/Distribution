package typings.gtmetrix.mod

import org.scalablytyped.runtime.StringDictionary
import typings.gtmetrix.anon.ReadonlyBuffer
import typings.gtmetrix.anon.ReadonlyTestBasicInfo
import typings.gtmetrix.anon.ReadonlyTestDetails
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestApi extends js.Object {
  
  def create(params: StringDictionary[js.Any]): js.Promise[ReadonlyTestBasicInfo] = js.native
  /**
    * Run a test.
    * {@link https://github.com/fvdm/nodejs-gtmetrix#testcreate}
    */
  def create(
    params: StringDictionary[js.Any],
    callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyTestBasicInfo, Unit]
  ): Unit = js.native
  
  def get(testId: String): js.Promise[ReadonlyTestDetails] = js.native
  def get(
    testId: String,
    callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyTestDetails, Unit]
  ): Unit = js.native
  def get(testId: String, resource: BinaryResourceType): js.Promise[ReadonlyBuffer] = js.native
  def get(
    testId: String,
    resource: BinaryResourceType,
    callback: js.Function2[/* error */ MetricsError, /* data */ Buffer, Unit]
  ): Unit = js.native
  def get(testId: String, resource: BinaryResourceType, polling: Double): js.Promise[Buffer] = js.native
  /**
    * Get details about a test or one of its resources.
    * When you specify a binary resource, i.e. screenshot,
    * the callback data will be a Buffer instance, so you can post-process the binary data however you like.
    */
  def get(
    testId: String,
    resource: BinaryResourceType,
    polling: Double,
    callback: js.Function2[/* error */ MetricsError, /* data */ Buffer, Unit]
  ): Unit = js.native
  def get(
    testId: String,
    resource: NonBinaryResourceType,
    callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyTestDetails, Unit]
  ): Unit = js.native
  def get(testId: String, resource: NonBinaryResourceType, polling: Double): js.Promise[ReadonlyTestDetails] = js.native
  def get(
    testId: String,
    resource: NonBinaryResourceType,
    polling: Double,
    callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyTestDetails, Unit]
  ): Unit = js.native
}
