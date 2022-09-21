package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsEventEmitter extends StObject {
  
  @JSName("emit")
  def emit_1[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */](
    event: E,
    name: E,
    eventObject: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<hls.js.hls.js.HlsListeners[E]>[1] */ js.Any
  ): Boolean = js.native
  
  def listenerCount[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */](event: E): Double = js.native
  
  def listeners[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */](event: E): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any
  ] = js.native
  
  def off[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](event: E): Unit = js.native
  def off[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any
  ): Unit = js.native
  def off[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any,
    context: Context
  ): Unit = js.native
  def off[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any,
    context: Context,
    once: Boolean
  ): Unit = js.native
  def off[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any,
    context: Unit,
    once: Boolean
  ): Unit = js.native
  def off[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](event: E, listener: Unit, context: Context): Unit = js.native
  def off[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](event: E, listener: Unit, context: Context, once: Boolean): Unit = js.native
  def off[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](event: E, listener: Unit, context: Unit, once: Boolean): Unit = js.native
  
  def on[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any
  ): Unit = js.native
  def on[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any,
    context: Context
  ): Unit = js.native
  
  def once[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any
  ): Unit = js.native
  def once[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */, Context](
    event: E,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: hls.js.hls.js.HlsListeners[E] */ js.Any,
    context: Context
  ): Unit = js.native
  
  def removeAllListeners[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */](): Unit = js.native
  def removeAllListeners[E /* <: /* keyof hls.js.hls.js.HlsListeners */ String */](event: E): Unit = js.native
}
