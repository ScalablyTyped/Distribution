package typings.ipfsCoreUtils

import typings.cids.mod.^
import typings.std.AsyncIterable
import typings.std.InstanceType
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinsNormaliseInputMod {
  
  @JSImport("ipfs-core-utils/dist/src/pins/normalise-input", JSImport.Namespace)
  @js.native
  def apply(input: Source): AsyncIterable[Pin] = js.native
  
  @js.native
  trait Pin extends StObject {
    
    var metadata: js.UndefOr[js.Any] = js.native
    
    var path: String | ^ = js.native
    
    var recursive: Boolean = js.native
  }
  object Pin {
    
    @scala.inline
    def apply(path: String | ^, recursive: Boolean): Pin = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pin]
    }
    
    @scala.inline
    implicit class PinMutableBuilder[Self <: Pin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPath(value: String | ^): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    }
  }
  
  type Source = String | ^ | ToPinWithPath | (Iterable[String | ^ | ToPinWithPath]) | (AsyncIterable[String | ^ | ToPinWithPath])
  
  type ToPin = String | ^ | ToPinWithPath
  
  @js.native
  trait ToPinWithCID extends StObject {
    
    var cid: ^ = js.native
    
    var metadata: js.UndefOr[js.Any] = js.native
    
    var path: js.UndefOr[scala.Nothing] = js.native
    
    var recursive: js.UndefOr[Boolean] = js.native
  }
  object ToPinWithCID {
    
    @scala.inline
    def apply(cid: ^): ToPinWithCID = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToPinWithCID]
    }
    
    @scala.inline
    implicit class ToPinWithCIDMutableBuilder[Self <: ToPinWithCID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: ^): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  @js.native
  trait ToPinWithPath extends StObject {
    
    var cid: js.UndefOr[scala.Nothing] = js.native
    
    var metadata: js.UndefOr[js.Any] = js.native
    
    var path: String | (InstanceType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ _
      ]) | ^ = js.native
    
    var recursive: js.UndefOr[Boolean] = js.native
  }
  object ToPinWithPath {
    
    @scala.inline
    def apply(
      path: String | (InstanceType[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ _
        ]) | ^
    ): ToPinWithPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToPinWithPath]
    }
    
    @scala.inline
    implicit class ToPinWithPathMutableBuilder[Self <: ToPinWithPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPath(
        value: String | (InstanceType[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ _
            ]) | ^
      ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
