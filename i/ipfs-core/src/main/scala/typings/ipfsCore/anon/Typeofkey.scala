package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofkey extends js.Object {
  
  def _export(hasKeychain: Keychain): js.Function3[
    /* name */ js.UndefOr[js.Any], 
    /* password */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    _
  ] = js.native
  
  def _import(hasKeychain: Keychain): js.Function4[
    /* name */ js.UndefOr[js.Any], 
    /* pem */ js.UndefOr[js.Any], 
    /* password */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    _
  ] = js.native
  
  def gen(hasKeychain: Keychain): js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  
  def info(hasKeychain: Keychain): js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  
  def list_1(hasKeychain: Keychain): js.Function1[/* options */ js.UndefOr[js.Any], _] = js.native
  
  def rename(hasKeychain: Keychain): js.Function3[
    /* oldName */ js.UndefOr[js.Any], 
    /* newName */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[Now]
  ] = js.native
  
  def rm_2(hasKeychain: Keychain): js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
}
object Typeofkey {
  
  @scala.inline
  def apply(
    _export: Keychain => js.Function3[
      /* name */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ],
    _import: Keychain => js.Function4[
      /* name */ js.UndefOr[js.Any], 
      /* pem */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ],
    gen: Keychain => js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _],
    info: Keychain => js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _],
    list_1: Keychain => js.Function1[/* options */ js.UndefOr[js.Any], _],
    rename: Keychain => js.Function3[
      /* oldName */ js.UndefOr[js.Any], 
      /* newName */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Promise[Now]
    ],
    rm_2: Keychain => js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _]
  ): Typeofkey = {
    val __obj = js.Dynamic.literal(_export = js.Any.fromFunction1(_export), _import = js.Any.fromFunction1(_import), gen = js.Any.fromFunction1(gen), info = js.Any.fromFunction1(info), list_1 = js.Any.fromFunction1(list_1), rename = js.Any.fromFunction1(rename), rm_2 = js.Any.fromFunction1(rm_2))
    __obj.asInstanceOf[Typeofkey]
  }
  
  @scala.inline
  implicit class TypeofkeyOps[Self <: Typeofkey] (val x: Self) extends AnyVal {
    
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
    def set_export(
      value: Keychain => js.Function3[
          /* name */ js.UndefOr[js.Any], 
          /* password */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          _
        ]
    ): Self = this.set("_export", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_import(
      value: Keychain => js.Function4[
          /* name */ js.UndefOr[js.Any], 
          /* pem */ js.UndefOr[js.Any], 
          /* password */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          _
        ]
    ): Self = this.set("_import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGen(
      value: Keychain => js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _]
    ): Self = this.set("gen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(
      value: Keychain => js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _]
    ): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList_1(value: Keychain => js.Function1[/* options */ js.UndefOr[js.Any], _]): Self = this.set("list_1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRename(
      value: Keychain => js.Function3[
          /* oldName */ js.UndefOr[js.Any], 
          /* newName */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          js.Promise[Now]
        ]
    ): Self = this.set("rename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRm_2(
      value: Keychain => js.Function2[/* name */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _]
    ): Self = this.set("rm_2", js.Any.fromFunction1(value))
  }
}
