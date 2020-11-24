package typings.lgtv2.mod

import typings.lgtv2.lgtv2Strings.close
import typings.lgtv2.lgtv2Strings.connect
import typings.lgtv2.lgtv2Strings.connecting
import typings.lgtv2.lgtv2Strings.error
import typings.lgtv2.lgtv2Strings.prompt
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LGTV extends EventEmitter {
  
  var clientKey: String = js.native
  
  def connect(host: String): Unit = js.native
  
  def disconnect(): Unit = js.native
  
  def getSocket(
    url: String,
    callback: js.Function2[/* error */ Error | Null, /* socket */ SpecializedSocket, Unit]
  ): Unit = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* hadError */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function1[/* host */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_prompt(event: prompt, listener: js.Function0[Unit]): this.type = js.native
  
  /* private */ def register(): Unit = js.native
  
  def request(uri: String): Unit = js.native
  def request(uri: String, callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]): Unit = js.native
  def request(
    uri: String,
    payload: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
  def request(uri: String, payload: js.Any): Unit = js.native
  def request(
    uri: String,
    payload: js.Any,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
  
  /* private */ def send(`type`: String, uri: String): Unit = js.native
  /* private */ def send(
    `type`: String,
    uri: String,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
  /* private */ def send(
    `type`: String,
    uri: String,
    payload: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
  /* private */ def send(`type`: String, uri: String, payload: js.Any): Unit = js.native
  /* private */ def send(
    `type`: String,
    uri: String,
    payload: js.Any,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
  
  def subscribe(uri: String): Unit = js.native
  def subscribe(uri: String, callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]): Unit = js.native
  def subscribe(
    uri: String,
    payload: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
  def subscribe(uri: String, payload: js.Any): Unit = js.native
  def subscribe(
    uri: String,
    payload: js.Any,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
}
