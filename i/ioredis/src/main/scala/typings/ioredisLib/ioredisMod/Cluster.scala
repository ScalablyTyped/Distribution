package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends nodeLib.NodeJSNs.EventEmitter
     with Commander {
  def connect(callback: js.Function0[scala.Unit]): js.Promise[_] = js.native
  def disconnect(): scala.Unit = js.native
  def get(key: KeyType): js.Promise[java.lang.String | scala.Null] = js.native
  def get(
    key: KeyType,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def nodes(): js.Array[Redis] = js.native
  def nodes(role: NodeRole): js.Array[Redis] = js.native
  def quit(): js.Promise[ioredisLib.ioredisLibStrings.OK] = js.native
  @JSName("quit")
  def quit_OK(callback: CallbackFunction[ioredisLib.ioredisLibStrings.OK]): js.Promise[ioredisLib.ioredisLibStrings.OK] = js.native
  def set(key: KeyType, value: js.Any): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: java.lang.String): js.Promise[java.lang.String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: java.lang.String, time: java.lang.String): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: java.lang.String, time: scala.Double): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_]): js.Promise[java.lang.String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: java.lang.String): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: java.lang.String,
    setMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: java.lang.String,
    setMode: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: scala.Double): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: scala.Double,
    setMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: scala.Double, setMode: scala.Double): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    setMode: js.Array[_],
    callback: js.Function2[/* err */ stdLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

