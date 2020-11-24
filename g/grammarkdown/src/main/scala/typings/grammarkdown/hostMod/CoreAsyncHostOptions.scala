package typings.grammarkdown.hostMod

import typings.esfxAsyncCanceltoken.mod.CancelToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreAsyncHostOptions extends HostBaseOptions {
  
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
    * A callback used to control asynchronous file reads.
    */
  var readFile: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* file */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      /* fallback */ js.Function2[
        /* file */ String, 
        /* cancelToken */ js.UndefOr[CancelToken], 
        js.Promise[js.UndefOr[String]]
      ], 
      js.UndefOr[js.Thenable[js.UndefOr[String]] | String]
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
    * A callback used to control asynchronous file writes.
    */
  var writeFile: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* file */ String, 
      /* content */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      /* fallback */ js.Function3[
        /* file */ String, 
        /* content */ String, 
        /* cancelToken */ js.UndefOr[CancelToken], 
        js.Promise[Unit]
      ], 
      js.Thenable[Unit] | Unit
    ]
  ] = js.native
}
object CoreAsyncHostOptions {
  
  @scala.inline
  def apply(): CoreAsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreAsyncHostOptions]
  }
  
  @scala.inline
  implicit class CoreAsyncHostOptionsOps[Self <: CoreAsyncHostOptions] (val x: Self) extends AnyVal {
    
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
    def setReadFile(
      value: js.ThisFunction3[
          /* this */ Unit, 
          /* file */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          /* fallback */ js.Function2[
            /* file */ String, 
            /* cancelToken */ js.UndefOr[CancelToken], 
            js.Promise[js.UndefOr[String]]
          ], 
          js.UndefOr[js.Thenable[js.UndefOr[String]] | String]
        ]
    ): Self = this.set("readFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    
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
    def setWriteFile(
      value: js.ThisFunction4[
          /* this */ Unit, 
          /* file */ String, 
          /* content */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          /* fallback */ js.Function3[
            /* file */ String, 
            /* content */ String, 
            /* cancelToken */ js.UndefOr[CancelToken], 
            js.Promise[Unit]
          ], 
          js.Thenable[Unit] | Unit
        ]
    ): Self = this.set("writeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteFile: Self = this.set("writeFile", js.undefined)
  }
}
