package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.pinAddAllMod.AddSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends js.Object {
  
  var addAll: ReturnType[
    js.Function1[
      /* hasPinManagerGcLockDag */ DagDAG, 
      js.Function2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ _, 
        /* options */ js.UndefOr[AddSettings with AbortOptions], 
        AsyncIterable[^]
      ]
    ]
  ] = js.native
}
object `2` {
  
  @scala.inline
  def apply(
    addAll: ReturnType[
      js.Function1[
        /* hasPinManagerGcLockDag */ DagDAG, 
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ _, 
          /* options */ js.UndefOr[AddSettings with AbortOptions], 
          AsyncIterable[^]
        ]
      ]
    ]
  ): `2` = {
    val __obj = js.Dynamic.literal(addAll = addAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def setAddAll(
      value: ReturnType[
          js.Function1[
            /* hasPinManagerGcLockDag */ DagDAG, 
            js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ _, 
              /* options */ js.UndefOr[AddSettings with AbortOptions], 
              AsyncIterable[^]
            ]
          ]
        ]
    ): Self = this.set("addAll", value.asInstanceOf[js.Any])
  }
}
