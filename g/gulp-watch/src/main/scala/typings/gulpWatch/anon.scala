package typings.gulpWatch

import typings.gulpWatch.gulpWatchStrings.add
import typings.gulpWatch.gulpWatchStrings.change
import typings.gulpWatch.gulpWatchStrings.unlink
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.File & {  event :'add' | 'change' | 'unlink'} */
  @js.native
  trait Fileeventaddchangeunlink extends StObject {
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    var event: add | change | unlink = js.native
    
    val lastModified: Double = js.native
    
    val name: String = js.native
    
    val size: Double = js.native
    
    def slice(): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, contentType: String): Blob = js.native
    def slice(start: Double, end: Unit, contentType: String): Blob = js.native
    def slice(start: Unit, end: Double): Blob = js.native
    def slice(start: Unit, end: Double, contentType: String): Blob = js.native
    def slice(start: Unit, end: Unit, contentType: String): Blob = js.native
    
    def stream(): ReadableStream[js.Any] = js.native
    
    def text(): js.Promise[String] = js.native
    
    val `type`: String = js.native
  }
}
