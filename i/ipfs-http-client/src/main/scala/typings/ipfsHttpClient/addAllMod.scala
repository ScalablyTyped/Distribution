package typings.ipfsHttpClient

import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addAllMod {
  
  @scala.inline
  def apply(clientOptions: ClientOptions): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.AddAllOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].apply(clientOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.AddAllOptions */ js.Any) & HttpOptions
    ], 
    AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
    ]
  ]]
  
  @JSImport("ipfs-http-client/dist/src/add-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait UnixFSEntry extends StObject {
    
    var cid: typings.cids.mod.^
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.MTime */ js.Any
      ] = js.undefined
    
    var path: String
    
    var size: Double
  }
  object UnixFSEntry {
    
    @scala.inline
    def apply(cid: typings.cids.mod.^, path: String, size: Double): UnixFSEntry = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnixFSEntry]
    }
    
    @scala.inline
    implicit class UnixFSEntryMutableBuilder[Self <: UnixFSEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: typings.cids.mod.^): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.MTime */ js.Any
      ): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
