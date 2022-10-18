package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.PreloadOptions
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.`unixfs-dir`
import typings.ipldDagPb.mod.PBLink
import typings.ipldDagPb.mod.PBNode
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    def data(cid: CID[Any, Double, Double, Version]): js.Promise[js.typedarray.Uint8Array] = js.native
    def data(cid: CID[Any, Double, Double, Version], options: AbortOptions & PreloadOptions & OptionExtension): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def get(cid: CID[Any, Double, Double, Version]): js.Promise[PBNode] = js.native
    def get(cid: CID[Any, Double, Double, Version], options: AbortOptions & PreloadOptions & OptionExtension): js.Promise[PBNode] = js.native
    
    def links(cid: CID[Any, Double, Double, Version]): js.Promise[js.Array[PBLink]] = js.native
    def links(cid: CID[Any, Double, Double, Version], options: AbortOptions & PreloadOptions & OptionExtension): js.Promise[js.Array[PBLink]] = js.native
    
    def `new`(): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def `new`(options: NewObjectOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    var patch: typings.ipfsCoreTypes.distSrcObjectPatchMod.API[js.Object] = js.native
    
    def put(obj: PBNode): js.Promise[CID[Any, Double, Double, Version]] = js.native
    def put(obj: PBNode, options: PutOptions & OptionExtension): js.Promise[CID[Any, Double, Double, Version]] = js.native
    
    def stat(cid: CID[Any, Double, Double, Version]): js.Promise[StatResult] = js.native
    def stat(cid: CID[Any, Double, Double, Version], options: AbortOptions & PreloadOptions & OptionExtension): js.Promise[StatResult] = js.native
  }
  
  trait NewObjectOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    var template: js.UndefOr[`unixfs-dir`] = js.undefined
  }
  object NewObjectOptions {
    
    inline def apply(): NewObjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewObjectOptions]
    }
    
    extension [Self <: NewObjectOptions](x: Self) {
      
      inline def setTemplate(value: `unixfs-dir`): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait PutOptions
    extends StObject
       with AbortOptions
       with PreloadOptions {
    
    var pin: js.UndefOr[Boolean] = js.undefined
  }
  object PutOptions {
    
    inline def apply(): PutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutOptions]
    }
    
    extension [Self <: PutOptions](x: Self) {
      
      inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    }
  }
  
  trait StatResult extends StObject {
    
    var BlockSize: Double
    
    var CumulativeSize: Double
    
    var DataSize: Double
    
    var Hash: CID[Any, Double, Double, Version]
    
    var LinksSize: Double
    
    var NumLinks: Double
  }
  object StatResult {
    
    inline def apply(
      BlockSize: Double,
      CumulativeSize: Double,
      DataSize: Double,
      Hash: CID[Any, Double, Double, Version],
      LinksSize: Double,
      NumLinks: Double
    ): StatResult = {
      val __obj = js.Dynamic.literal(BlockSize = BlockSize.asInstanceOf[js.Any], CumulativeSize = CumulativeSize.asInstanceOf[js.Any], DataSize = DataSize.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], LinksSize = LinksSize.asInstanceOf[js.Any], NumLinks = NumLinks.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatResult]
    }
    
    extension [Self <: StatResult](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
      
      inline def setCumulativeSize(value: Double): Self = StObject.set(x, "CumulativeSize", value.asInstanceOf[js.Any])
      
      inline def setDataSize(value: Double): Self = StObject.set(x, "DataSize", value.asInstanceOf[js.Any])
      
      inline def setHash(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
      
      inline def setLinksSize(value: Double): Self = StObject.set(x, "LinksSize", value.asInstanceOf[js.Any])
      
      inline def setNumLinks(value: Double): Self = StObject.set(x, "NumLinks", value.asInstanceOf[js.Any])
    }
  }
}
