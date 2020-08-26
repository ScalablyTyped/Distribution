package typings.ky.mod

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePromise
  extends js.Promise[Response] {
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def formData(): js.Promise[FormData] = js.native
  // TODO: Use `json<T extends JSONValue>(): Promise<T>;` when it's fixed in TS.
  // See https://github.com/microsoft/TypeScript/issues/15300 and https://github.com/sindresorhus/ky/pull/80
  /**
  	Get the response body as JSON.
  	@example
  	```
  	import ky from 'ky';
  	const parsed = await ky(…).json();
  	```
  	@example
  	```
  	import ky from 'ky';
  	interface Result {
  		value: number;
  	}
  	const result = await ky(…).json<Result>();
  	```
  	*/
  def json[T](): js.Promise[T] = js.native
  def text(): js.Promise[String] = js.native
}

