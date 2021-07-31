package typings.ipfsCoreUtils

import typings.std.AsyncIterable
import typings.std.InstanceType
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinsNormaliseInputMod {
  
  @scala.inline
  def apply(input: Source): AsyncIterable[Pin] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[Pin]]
  
  @JSImport("ipfs-core-utils/dist/src/pins/normalise-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Pin extends StObject {
    
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    var path: String | typings.cids.mod.^
    
    var recursive: Boolean
  }
  object Pin {
    
    @scala.inline
    def apply(path: String | typings.cids.mod.^, recursive: Boolean): Pin = {
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
      def setPath(value: String | typings.cids.mod.^): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    }
  }
  
  type Source = String | typings.cids.mod.^ | ToPinWithPath | (Iterable[String | typings.cids.mod.^ | ToPinWithPath]) | (AsyncIterable[String | typings.cids.mod.^ | ToPinWithPath])
  
  type ToPin = String | typings.cids.mod.^ | ToPinWithPath
  
  trait ToPinWithCID extends StObject {
    
    var cid: typings.cids.mod.^
    
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    var path: Unit
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object ToPinWithCID {
    
    @scala.inline
    def apply(cid: typings.cids.mod.^, path: Unit): ToPinWithCID = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToPinWithCID]
    }
    
    @scala.inline
    implicit class ToPinWithCIDMutableBuilder[Self <: ToPinWithCID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: typings.cids.mod.^): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPath(value: Unit): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait ToPinWithPath extends StObject {
    
    var cid: Unit
    
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    var path: String | (InstanceType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ js.Any
      ]) | typings.cids.mod.^
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object ToPinWithPath {
    
    @scala.inline
    def apply(
      cid: Unit,
      path: String | (InstanceType[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ js.Any
        ]) | typings.cids.mod.^
    ): ToPinWithPath = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToPinWithPath]
    }
    
    @scala.inline
    implicit class ToPinWithPathMutableBuilder[Self <: ToPinWithPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: Unit): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPath(
        value: String | (InstanceType[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ js.Any
            ]) | typings.cids.mod.^
      ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
}
