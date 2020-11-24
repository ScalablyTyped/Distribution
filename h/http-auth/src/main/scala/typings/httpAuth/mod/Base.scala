package typings.httpAuth.mod

import typings.httpAuth.httpAuthBooleans.`false`
import typings.httpAuth.httpAuthBooleans.`true`
import typings.httpAuth.httpAuthStrings.error
import typings.httpAuth.httpAuthStrings.fail
import typings.httpAuth.httpAuthStrings.success
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends EventEmitter {
  
  /* private */ def ask(res: ServerResponse, result: BasicResult[Boolean]): Unit = js.native
  /* private */ def ask(res: ServerResponse, result: DigestResult[Boolean]): Unit = js.native
  
  def check(): CheckedRequestListener = js.native
  def check(callback: CheckedRequestListener): CheckedRequestListener = js.native
  
  def findUser(req: IncomingMessage, hashOrClientOptions: String, callback: ResultEmitter): Unit = js.native
  def findUser(req: IncomingMessage, hashOrClientOptions: ClientOptions, callback: ResultEmitter): Unit = js.native
  
  def generateHeader(): String = js.native
  def generateHeader(result: DigestResult[Boolean]): String = js.native
  
  /* private */ def isAuthenticated(req: IncomingMessage, callback: ResultEmitter): Unit = js.native
  
  /* private */ def loadUsers(): Unit = js.native
  
  def on(
    event: fail,
    callback: js.Function1[/* result */ BasicResult[`false`] | DigestResult[`false`], Unit]
  ): this.type = js.native
  def on(
    event: success,
    callback: js.Function1[/* result */ BasicResult[`true`] | DigestResult[`true`], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ Error, Unit]): this.type = js.native
  
  def parseAuthorization(header: String): js.UndefOr[String | ClientOptions] = js.native
  
  def processLine(userLine: String): Unit = js.native
}
