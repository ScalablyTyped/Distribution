package typings.ipfsCoreUtils

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Date
import typings.std.Iterable
import typings.std.ReadableStream
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normaliseInputNormaliseInputMod {
  
  @scala.inline
  def apply[Content /* <: Blob | AsyncIterable[Uint8Array] */](
    input: Source,
    normaliseContent: js.Function1[/* content */ ToContent, Content | js.Promise[Content]]
  ): AsyncIterable[Directory | File[Content]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], normaliseContent.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[Directory | File[Content]]]
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/normalise-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Directory
    extends StObject
       with Entry[js.Any] {
    
    var content: Unit
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[typings.ipfsCoreUtils.formatMtimeMod.MTime] = js.undefined
    
    var path: String
  }
  object Directory {
    
    @scala.inline
    def apply(content: Unit, path: String): Directory = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directory]
    }
    
    @scala.inline
    implicit class DirectoryMutableBuilder[Self <: Directory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: Unit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: typings.ipfsCoreUtils.formatMtimeMod.MTime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.File[Content]
    - typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Directory
  */
  trait Entry[Content /* <: Blob | AsyncIterable[Uint8Array] */] extends StObject
  object Entry {
    
    @scala.inline
    def Directory(content: Unit, path: String): typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Directory = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Directory]
    }
    
    @scala.inline
    def File[Content /* <: Blob | AsyncIterable[Uint8Array] */](path: String): typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.File[Content] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.File[Content]]
    }
  }
  
  trait File[Content /* <: Blob | AsyncIterable[Uint8Array] */]
    extends StObject
       with Entry[Content] {
    
    var content: js.UndefOr[Content] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[typings.ipfsCoreUtils.formatMtimeMod.MTime] = js.undefined
    
    var path: String
  }
  object File {
    
    @scala.inline
    def apply[Content /* <: Blob | AsyncIterable[Uint8Array] */](path: String): File[Content] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[File[Content]]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File[?], Content /* <: Blob | AsyncIterable[Uint8Array] */] (val x: Self & File[Content]) extends AnyVal {
      
      @scala.inline
      def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: typings.ipfsCoreUtils.formatMtimeMod.MTime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileInput extends StObject {
    
    var content: js.UndefOr[
        String | Blob | AsyncIterable[Uint8Array] | ArrayBufferView | ArrayBuffer | Iterable[Uint8Array] | ReadableStream[Uint8Array]
      ] = js.undefined
    
    var mode: js.UndefOr[String | Double] = js.undefined
    
    var mtime: js.UndefOr[typings.ipfsCoreUtils.formatMtimeMod.MTime | Date | (js.Tuple2[Double, Double])] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object FileInput {
    
    @scala.inline
    def apply(): FileInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileInput]
    }
    
    @scala.inline
    implicit class FileInputMutableBuilder[Self <: FileInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(
        value: String | Blob | AsyncIterable[Uint8Array] | ArrayBufferView | ArrayBuffer | Iterable[Uint8Array] | ReadableStream[Uint8Array]
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: typings.ipfsCoreUtils.formatMtimeMod.MTime | Date | (js.Tuple2[Double, Double])): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type HRTime = js.Tuple2[Double, Double]
  
  trait MTime extends StObject {
    
    /**
      * - the number of nanoseconds since the last full
      * second.
      */
    var nsecs: Double
    
    /**
      * - the number of seconds since (positive) or before
      * (negative) the Unix Epoch began
      */
    var secs: Double
  }
  object MTime {
    
    @scala.inline
    def apply(nsecs: Double, secs: Double): MTime = {
      val __obj = js.Dynamic.literal(nsecs = nsecs.asInstanceOf[js.Any], secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MTime]
    }
    
    @scala.inline
    implicit class MTimeMutableBuilder[Self <: MTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecs(value: Double): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
    }
  }
  
  type Mode = Double
  
  type Source = (Iterable[
    String | Blob | AsyncIterable[Uint8Array] | ArrayBufferView | ArrayBuffer | Iterable[Uint8Array] | ReadableStream[Uint8Array] | FileInput
  ]) | (AsyncIterable[
    String | Blob | AsyncIterable[Uint8Array] | ArrayBufferView | ArrayBuffer | Iterable[Uint8Array] | ReadableStream[Uint8Array] | FileInput
  ]) | (ReadableStream[
    String | Blob | AsyncIterable[Uint8Array] | ArrayBufferView | ArrayBuffer | Iterable[Uint8Array] | ReadableStream[Uint8Array] | FileInput
  ])
  
  type ToContent = String | Blob | AsyncIterable[Uint8Array] | ArrayBufferView | ArrayBuffer | Iterable[Uint8Array] | ReadableStream[Uint8Array]
  
  type ToFile = String | Blob | AsyncIterable[Uint8Array] | ArrayBufferView | ArrayBuffer | Iterable[Uint8Array] | ReadableStream[Uint8Array] | FileInput
  
  type UnixTime = typings.ipfsCoreUtils.formatMtimeMod.MTime | Date | (js.Tuple2[Double, Double])
}
