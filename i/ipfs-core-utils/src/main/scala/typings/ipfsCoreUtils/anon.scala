package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.distSrcMultihashesMod.MultihashHasher
import typings.ipfsCoreUtils.distSrcTypesMod.LoadBaseFn
import typings.ipfsCoreUtils.distSrcTypesMod.LoadCodecFn
import typings.ipfsCoreUtils.distSrcTypesMod.LoadHasherFn
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.FormData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bases extends StObject {
    
    var bases: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
      ]
    
    var loadBase: js.UndefOr[LoadBaseFn] = js.undefined
  }
  object Bases {
    
    inline def apply(
      bases: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
        ]
    ): Bases = {
      val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bases]
    }
    
    extension [Self <: Bases](x: Self) {
      
      inline def setBases(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
            ]
      ): Self = StObject.set(x, "bases", value.asInstanceOf[js.Any])
      
      inline def setBasesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any)*
      ): Self = StObject.set(x, "bases", js.Array(value*))
      
      inline def setLoadBase(
        value: /* codeOrName */ String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
            ]
      ): Self = StObject.set(x, "loadBase", js.Any.fromFunction1(value))
      
      inline def setLoadBaseUndefined: Self = StObject.set(x, "loadBase", js.undefined)
    }
  }
  
  trait Body extends StObject {
    
    var body: FormData
    
    var headers: typings.std.Headers | (Record[String, String])
    
    var parts: js.Array[End]
    
    var total: Double
  }
  object Body {
    
    inline def apply(
      body: FormData,
      headers: typings.std.Headers | (Record[String, String]),
      parts: js.Array[End],
      total: Double
    ): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: typings.std.Headers | (Record[String, String])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setParts(value: js.Array[End]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: End*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cid extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Cid {
    
    inline def apply(cid: CID[Any, Double, Double, Version]): Cid = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cid]
    }
    
    extension [Self <: Cid](x: Self) {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Codecs extends StObject {
    
    var codecs: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.BlockCodec<any, any> */ Any
      ]
    
    var loadCodec: js.UndefOr[LoadCodecFn] = js.undefined
  }
  object Codecs {
    
    inline def apply(
      codecs: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.BlockCodec<any, any> */ Any
        ]
    ): Codecs = {
      val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codecs]
    }
    
    extension [Self <: Codecs](x: Self) {
      
      inline def setCodecs(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.BlockCodec<any, any> */ Any
            ]
      ): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
      
      inline def setCodecsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.BlockCodec<any, any> */ Any)*
      ): Self = StObject.set(x, "codecs", js.Array(value*))
      
      inline def setLoadCodec(
        value: /* codeOrName */ Double | String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
            ]
      ): Self = StObject.set(x, "loadCodec", js.Any.fromFunction1(value))
      
      inline def setLoadCodecUndefined: Self = StObject.set(x, "loadCodec", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hashers extends StObject {
    
    var hashers: js.Array[MultihashHasher]
    
    var loadHasher: js.UndefOr[LoadHasherFn] = js.undefined
  }
  object Hashers {
    
    inline def apply(hashers: js.Array[MultihashHasher]): Hashers = {
      val __obj = js.Dynamic.literal(hashers = hashers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hashers]
    }
    
    extension [Self <: Hashers](x: Self) {
      
      inline def setHashers(value: js.Array[MultihashHasher]): Self = StObject.set(x, "hashers", value.asInstanceOf[js.Any])
      
      inline def setHashersVarargs(value: MultihashHasher*): Self = StObject.set(x, "hashers", js.Array(value*))
      
      inline def setLoadHasher(
        value: /* codeOrName */ Double | String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
            ]
      ): Self = StObject.set(x, "loadHasher", js.Any.fromFunction1(value))
      
      inline def setLoadHasherUndefined: Self = StObject.set(x, "loadHasher", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var body: Any
    
    var headers: Any
    
    var parts: Null
    
    var total: Double
  }
  object Headers {
    
    inline def apply(body: Any, headers: Any, parts: Null, total: Double): Headers = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setParts(value: Null): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
