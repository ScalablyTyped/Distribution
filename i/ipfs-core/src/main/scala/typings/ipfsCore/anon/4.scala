package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends js.Object {
  
  var rmAll: ReturnType[
    js.Function1[
      /* hasPinManagerGcLockDag */ GcLockGCLock, 
      js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ _, 
        /* _options */ js.UndefOr[AbortOptions], 
        AsyncIterable[^]
      ]
    ]
  ] = js.native
}
object `4` {
  
  @scala.inline
  def apply(
    rmAll: ReturnType[
      js.Function1[
        /* hasPinManagerGcLockDag */ GcLockGCLock, 
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ _, 
          /* _options */ js.UndefOr[AbortOptions], 
          AsyncIterable[^]
        ]
      ]
    ]
  ): `4` = {
    val __obj = js.Dynamic.literal(rmAll = rmAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4Ops`[Self <: `4`] (val x: Self) extends AnyVal {
    
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
    def setRmAll(
      value: ReturnType[
          js.Function1[
            /* hasPinManagerGcLockDag */ GcLockGCLock, 
            js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ _, 
              /* _options */ js.UndefOr[AbortOptions], 
              AsyncIterable[^]
            ]
          ]
        ]
    ): Self = this.set("rmAll", value.asInstanceOf[js.Any])
  }
}
