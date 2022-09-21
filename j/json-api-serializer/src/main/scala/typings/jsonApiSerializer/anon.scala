package typings.jsonApiSerializer

import typings.jsonApiSerializer.mod.LinkObject
import typings.jsonApiSerializer.mod.Linkage
import typings.jsonApiSerializer.mod.LinksCallback
import typings.jsonApiSerializer.mod.LinksObject
import typings.jsonApiSerializer.mod.Relationship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data
    extends StObject
       with Relationship {
    
    var data: Linkage | js.Array[Linkage]
    
    var links: js.UndefOr[LinksObject | LinksCallback] = js.undefined
    
    var meta: js.UndefOr[typings.jsonApiSerializer.mod.Meta] = js.undefined
  }
  object Data {
    
    inline def apply(data: Linkage | js.Array[Linkage]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Linkage | js.Array[Linkage]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Linkage*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setLinks(value: LinksObject | LinksCallback): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "links", js.Any.fromFunction2(value))
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMeta(value: typings.jsonApiSerializer.mod.Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  trait Links
    extends StObject
       with Relationship {
    
    var data: js.UndefOr[Linkage | js.Array[Linkage]] = js.undefined
    
    var links: js.UndefOr[LinksObject | LinksCallback] = js.undefined
    
    var meta: typings.jsonApiSerializer.mod.Meta
  }
  object Links {
    
    inline def apply(meta: typings.jsonApiSerializer.mod.Meta): Links = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links]
    }
    
    extension [Self <: Links](x: Self) {
      
      inline def setData(value: Linkage | js.Array[Linkage]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Linkage*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setLinks(value: LinksObject | LinksCallback): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "links", js.Any.fromFunction2(value))
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMeta(value: typings.jsonApiSerializer.mod.Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined json-api-serializer.json-api-serializer.LinksObject & {  about :json-api-serializer.json-api-serializer.LinkObject | string} */
  trait LinksObjectaboutLinkObjec extends StObject {
    
    var about: LinkObject | String
    
    var related: js.UndefOr[LinkObject | LinksCallback | String | Null] = js.undefined
    
    var self: js.UndefOr[LinkObject | LinksCallback | String | Null] = js.undefined
  }
  object LinksObjectaboutLinkObjec {
    
    inline def apply(about: LinkObject | String): LinksObjectaboutLinkObjec = {
      val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinksObjectaboutLinkObjec]
    }
    
    extension [Self <: LinksObjectaboutLinkObjec](x: Self) {
      
      inline def setAbout(value: LinkObject | String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setRelated(value: LinkObject | LinksCallback | String): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      inline def setRelatedFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "related", js.Any.fromFunction2(value))
      
      inline def setRelatedNull: Self = StObject.set(x, "related", null)
      
      inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
      
      inline def setSelf(value: LinkObject | LinksCallback | String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      inline def setSelfFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "self", js.Any.fromFunction2(value))
      
      inline def setSelfNull: Self = StObject.set(x, "self", null)
      
      inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    }
  }
  
  trait Meta
    extends StObject
       with Relationship {
    
    var data: js.UndefOr[Linkage | js.Array[Linkage]] = js.undefined
    
    var links: js.UndefOr[LinksObject | LinksCallback] = js.undefined
    
    var meta: js.UndefOr[typings.jsonApiSerializer.mod.Meta] = js.undefined
  }
  object Meta {
    
    inline def apply(): Meta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
      inline def setData(value: Linkage | js.Array[Linkage]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Linkage*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setLinks(value: LinksObject | LinksCallback): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksFunction2(value: (/* data */ Any, /* extraData */ js.UndefOr[Any]) => String | LinksObject): Self = StObject.set(x, "links", js.Any.fromFunction2(value))
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setMeta(value: typings.jsonApiSerializer.mod.Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
}
