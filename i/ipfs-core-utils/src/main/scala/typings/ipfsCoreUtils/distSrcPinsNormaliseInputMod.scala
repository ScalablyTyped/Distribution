package typings.ipfsCoreUtils

import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinsNormaliseInputMod {
  
  @JSImport("ipfs-core-utils/dist/src/pins/normalise-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normaliseInput(input: Source): AsyncIterable[Pin] = ^.asInstanceOf[js.Dynamic].applyDynamic("normaliseInput")(input.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[Pin]]
  
  trait Pin extends StObject {
    
    var metadata: js.UndefOr[Any] = js.undefined
    
    var path: String | (CID[Any, Double, Double, Version])
    
    var recursive: Boolean
  }
  object Pin {
    
    inline def apply(path: String | (CID[Any, Double, Double, Version]), recursive: Boolean): Pin = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pin] (val x: Self) extends AnyVal {
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPath(value: String | (CID[Any, Double, Double, Version])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pinnable extends StObject {
    
    var cid: js.UndefOr[CID[Any, Double, Double, Version]] = js.undefined
    
    var metadata: js.UndefOr[Any] = js.undefined
    
    var path: js.UndefOr[String | (CID[Any, Double, Double, Version])] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Pinnable {
    
    inline def apply(): Pinnable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pinnable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pinnable] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPath(value: String | (CID[Any, Double, Double, Version])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  type Source = ToPin | js.Iterable[ToPin] | AsyncIterable[ToPin]
  
  type ToPin = (CID[Any, Double, Double, Version]) | String | (InstanceType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.String */ Any
  ]) | Pinnable
}
