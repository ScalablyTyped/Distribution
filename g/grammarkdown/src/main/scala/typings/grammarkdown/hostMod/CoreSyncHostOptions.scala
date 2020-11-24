package typings.grammarkdown.hostMod

import typings.esfxAsyncCanceltoken.mod.CancelToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreSyncHostOptions extends HostBaseOptions {
  
  /**
    * A callback used to control file normalization when generating keys for maps based on the case sensitivity of the host.
    */
  var normalizeFile: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* file */ String, 
      /* fallback */ js.Function1[/* file */ String, String], 
      String
    ]
  ] = js.native
  
  /**
    * A callback used to control synchronous file reads.
    */
  var readFileSync: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* file */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      /* fallback */ js.Function2[/* file */ String, /* cancelToken */ js.UndefOr[CancelToken], js.UndefOr[String]], 
      js.UndefOr[String]
    ]
  ] = js.native
  
  /**
    * A callback used to control file resolution.
    */
  var resolveFile: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* file */ String, 
      /* referer */ js.UndefOr[String], 
      /* fallback */ js.Function2[/* file */ String, /* referer */ js.UndefOr[String], String], 
      String
    ]
  ] = js.native
  
  /**
    * A callback used to control known grammar resolution.
    */
  var resolveKnownGrammar: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* name */ String, 
      /* fallback */ js.Function1[/* name */ String, js.UndefOr[String]], 
      js.UndefOr[String]
    ]
  ] = js.native
  
  /**
    * A callback used to control synchronous file writes.
    */
  var writeFileSync: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* file */ String, 
      /* content */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      /* fallback */ js.Function3[
        /* file */ String, 
        /* content */ String, 
        /* cancelToken */ js.UndefOr[CancelToken], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
}
object CoreSyncHostOptions {
  
  @scala.inline
  def apply(): CoreSyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreSyncHostOptions]
  }
  
  @scala.inline
  implicit class CoreSyncHostOptionsOps[Self <: CoreSyncHostOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNormalizeFile(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* file */ String, 
          /* fallback */ js.Function1[/* file */ String, String], 
          String
        ]
    ): Self = this.set("normalizeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeFile: Self = this.set("normalizeFile", js.undefined)
    
    @scala.inline
    def setReadFileSync(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* file */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          /* fallback */ js.Function2[/* file */ String, /* cancelToken */ js.UndefOr[CancelToken], js.UndefOr[String]], 
          js.UndefOr[String]
        ]
    ): Self = this.set("readFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadFileSync: Self = this.set("readFileSync", js.undefined)
    
    @scala.inline
    def setResolveFile(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* file */ String, 
          /* referer */ js.UndefOr[String], 
          /* fallback */ js.Function2[/* file */ String, /* referer */ js.UndefOr[String], String], 
          String
        ]
    ): Self = this.set("resolveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveFile: Self = this.set("resolveFile", js.undefined)
    
    @scala.inline
    def setResolveKnownGrammar(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* name */ String, 
          /* fallback */ js.Function1[/* name */ String, js.UndefOr[String]], 
          js.UndefOr[String]
        ]
    ): Self = this.set("resolveKnownGrammar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveKnownGrammar: Self = this.set("resolveKnownGrammar", js.undefined)
    
    @scala.inline
    def setWriteFileSync(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* file */ String, 
          /* content */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          /* fallback */ js.Function3[
            /* file */ String, 
            /* content */ String, 
            /* cancelToken */ js.UndefOr[CancelToken], 
            Unit
          ], 
          Unit
        ]
    ): Self = this.set("writeFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteFileSync: Self = this.set("writeFileSync", js.undefined)
  }
}
