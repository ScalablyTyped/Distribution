package typings.jsdevtoolsReaddirEnhanced

import org.scalablytyped.runtime.Shortcut
import typings.jsdevtoolsReaddirEnhanced.anon.Fn0
import typings.jsdevtoolsReaddirEnhanced.anon.FnCall
import typings.jsdevtoolsReaddirEnhanced.anon.FnCallDirOptions
import typings.jsdevtoolsReaddirEnhanced.anon.FnCallDirOptionsCallback
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jsdevtools/readdir-enhanced", JSImport.Default)
  @js.native
  val default: Readdir_ = js.native
  
  @JSImport("@jsdevtools/readdir-enhanced", "readdir")
  @js.native
  val readdir: Readdir_ = js.native
  
  @JSImport("@jsdevtools/readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
  
  @JSImport("@jsdevtools/readdir-enhanced", "readdirIterator")
  @js.native
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirIterator")
  @js.native
  def readdirIterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirIterator")
  @js.native
  def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
  
  @JSImport("@jsdevtools/readdir-enhanced", "readdirStream")
  @js.native
  def readdirStream(dir: String): Readable = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirStream")
  @js.native
  def readdirStream(dir: String, options: Optionsstatsfalseundefine): Readable = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirStream")
  @js.native
  def readdirStream(dir: String, options: Optionsstatstrue): Readable = js.native
  
  @JSImport("@jsdevtools/readdir-enhanced", "readdirSync")
  @js.native
  def readdirSync(dir: String): js.Array[String] = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirSync")
  @js.native
  def readdirSync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = js.native
  @JSImport("@jsdevtools/readdir-enhanced", "readdirSync")
  @js.native
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
  
  /* Inlined {None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): std.Promise<std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): std.Promise<std.Array<string>>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>>): void, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined}, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, options : undefined, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void} & {  sync :{None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): std.Array<string>},   async :{None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): std.Promise<std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): std.Promise<std.Array<string>>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>>): void, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined}, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, options : undefined, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void, None (dir : string, callback : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Callback<std.Array<string>>): void},   stream :{None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): node.stream.Readable, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): node.stream.Readable},   iterator :{None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true}): std.AsyncIterableIterator<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Stats>, None (dir : string, options : @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} | undefined): std.AsyncIterableIterator<string>}} */
  @js.native
  trait Readdir_ extends StObject {
    
    def apply(dir: String): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def apply(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
    
    def async(dir: String): js.Promise[js.Array[String]] = js.native
    def async(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
    def async(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def async(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
    @JSName("async")
    var async_Original: FnCallDirOptionsCallback = js.native
    
    def iterator(dir: String): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
    @JSName("iterator")
    var iterator_Original: Fn0 = js.native
    
    def stream(dir: String): Readable = js.native
    def stream(dir: String, options: Optionsstatsfalseundefine): Readable = js.native
    def stream(dir: String, options: Optionsstatstrue): Readable = js.native
    @JSName("stream")
    var stream_Original: FnCallDirOptions = js.native
    
    def sync(dir: String): js.Array[String] = js.native
    def sync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = js.native
    def sync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
    @JSName("sync")
    var sync_Original: FnCall = js.native
  }
  
  type _To = Readdir_
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Readdir_ = default
}
