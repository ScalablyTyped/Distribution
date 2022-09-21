package typings.gulpWatch

import typings.gulpWatch.gulpWatchStrings.add
import typings.gulpWatch.gulpWatchStrings.change
import typings.gulpWatch.gulpWatchStrings.unlink
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.File & {  event :'add' | 'change' | 'unlink'} */
  @js.native
  trait Fileeventaddchangeunlink extends StObject {
    
    /* standard dom */
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    var event: add | change | unlink = js.native
    
    /* standard dom */
    val lastModified: Double = js.native
    
    /* standard dom */
    val name: String = js.native
    
    /* standard dom */
    val size: Double = js.native
    
    /* standard dom */
    def slice(): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, contentType: String): Blob = js.native
    def slice(start: Double, end: Unit, contentType: String): Blob = js.native
    def slice(start: Unit, end: Double): Blob = js.native
    def slice(start: Unit, end: Double, contentType: String): Blob = js.native
    def slice(start: Unit, end: Unit, contentType: String): Blob = js.native
    
    /* standard dom */
    def stream(): ReadableStream[js.typedarray.Uint8Array] = js.native
    
    /* standard dom */
    def text(): js.Promise[String] = js.native
    
    /* standard dom */
    val `type`: String = js.native
    
    /* standard dom */
    val webkitRelativePath: String = js.native
  }
}
