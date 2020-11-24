package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofobject extends js.Object {
  
  def _new(hasIpldPreload: IpldAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  def data(hasIpldPreload: IpldAny): js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  def get_2(hasIpldPreload: IpldAny): js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  def links(hasDag: DagAny): js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  val patch: Typeofpatch = js.native
  
  def put_2(hasIpldGcLockPreload: GcLockIpldPreload): js.Function2[/* obj */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  def stat_2(hasIpldPreload: IpldAny): js.Function2[
    /* multihash */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[BlockSize]
  ] = js.native
}
object Typeofobject {
  
  @scala.inline
  def apply(
    _new: IpldAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]],
    data: IpldAny => js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]],
    get_2: IpldAny => js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]],
    links: DagAny => js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]],
    patch: Typeofpatch,
    put_2: GcLockIpldPreload => js.Function2[/* obj */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]],
    stat_2: IpldAny => js.Function2[
      /* multihash */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Promise[BlockSize]
    ]
  ): Typeofobject = {
    val __obj = js.Dynamic.literal(_new = js.Any.fromFunction1(_new), data = js.Any.fromFunction1(data), get_2 = js.Any.fromFunction1(get_2), links = js.Any.fromFunction1(links), patch = patch.asInstanceOf[js.Any], put_2 = js.Any.fromFunction1(put_2), stat_2 = js.Any.fromFunction1(stat_2))
    __obj.asInstanceOf[Typeofobject]
  }
  
  @scala.inline
  implicit class TypeofobjectOps[Self <: Typeofobject] (val x: Self) extends AnyVal {
    
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
    def set_new(value: IpldAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]]): Self = this.set("_new", js.Any.fromFunction1(value))
    
    @scala.inline
    def setData(
      value: IpldAny => js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]]
    ): Self = this.set("data", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_2(
      value: IpldAny => js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]]
    ): Self = this.set("get_2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinks(
      value: DagAny => js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]]
    ): Self = this.set("links", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(value: Typeofpatch): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPut_2(
      value: GcLockIpldPreload => js.Function2[/* obj */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]]
    ): Self = this.set("put_2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStat_2(
      value: IpldAny => js.Function2[
          /* multihash */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          js.Promise[BlockSize]
        ]
    ): Self = this.set("stat_2", js.Any.fromFunction1(value))
  }
}
