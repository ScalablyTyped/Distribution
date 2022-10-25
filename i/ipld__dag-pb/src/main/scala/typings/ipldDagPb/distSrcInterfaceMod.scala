package typings.ipldDagPb

import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcInterfaceMod {
  
  trait PBLink extends StObject {
    
    var Hash: CID[Any, Double, Double, Version]
    
    var Name: js.UndefOr[String] = js.undefined
    
    var Tsize: js.UndefOr[Double] = js.undefined
  }
  object PBLink {
    
    inline def apply(Hash: CID[Any, Double, Double, Version]): PBLink = {
      val __obj = js.Dynamic.literal(Hash = Hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[PBLink]
    }
    
    extension [Self <: PBLink](x: Self) {
      
      inline def setHash(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setTsize(value: Double): Self = StObject.set(x, "Tsize", value.asInstanceOf[js.Any])
      
      inline def setTsizeUndefined: Self = StObject.set(x, "Tsize", js.undefined)
    }
  }
  
  trait PBNode extends StObject {
    
    var Data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var Links: js.Array[PBLink]
  }
  object PBNode {
    
    inline def apply(Links: js.Array[PBLink]): PBNode = {
      val __obj = js.Dynamic.literal(Links = Links.asInstanceOf[js.Any])
      __obj.asInstanceOf[PBNode]
    }
    
    extension [Self <: PBNode](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setLinks(value: js.Array[PBLink]): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: PBLink*): Self = StObject.set(x, "Links", js.Array(value*))
    }
  }
  
  trait RawPBLink extends StObject {
    
    var Hash: js.typedarray.Uint8Array
    
    var Name: String
    
    var Tsize: Double
  }
  object RawPBLink {
    
    inline def apply(Hash: js.typedarray.Uint8Array, Name: String, Tsize: Double): RawPBLink = {
      val __obj = js.Dynamic.literal(Hash = Hash.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Tsize = Tsize.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawPBLink]
    }
    
    extension [Self <: RawPBLink](x: Self) {
      
      inline def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setTsize(value: Double): Self = StObject.set(x, "Tsize", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawPBNode extends StObject {
    
    var Data: js.typedarray.Uint8Array
    
    var Links: js.Array[RawPBLink]
  }
  object RawPBNode {
    
    inline def apply(Data: js.typedarray.Uint8Array, Links: js.Array[RawPBLink]): RawPBNode = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Links = Links.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawPBNode]
    }
    
    extension [Self <: RawPBNode](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[RawPBLink]): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: RawPBLink*): Self = StObject.set(x, "Links", js.Array(value*))
    }
  }
}
