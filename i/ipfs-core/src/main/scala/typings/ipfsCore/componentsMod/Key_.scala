package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.FnCallHasKeychain
import typings.ipfsCore.anon.FnCallHasRmAll
import typings.ipfsCore.anon.Keychain
import typings.ipfsCore.anon.Now
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key_ extends js.Object {
  
  var export: ReturnType[
    js.Function1[
      /* hasKeychain */ Keychain, 
      js.Function3[/* name */ js.UndefOr[_], /* password */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
    ]
  ] = js.native
  
  var gen: ReturnType[
    js.Function1[
      /* hasKeychain */ Keychain, 
      js.Function2[/* name */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
    ]
  ] = js.native
  
  var `import`: ReturnType[
    js.Function1[
      /* hasKeychain */ Keychain, 
      js.Function4[
        /* name */ js.UndefOr[_], 
        /* pem */ js.UndefOr[_], 
        /* password */ js.UndefOr[_], 
        /* options */ js.UndefOr[_], 
        _
      ]
    ]
  ] = js.native
  
  var info: ReturnType[
    js.Function1[
      /* hasKeychain */ Keychain, 
      js.Function2[/* name */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
    ]
  ] = js.native
  
  var list: ReturnType[FnCallHasKeychain] = js.native
  
  var rename: ReturnType[
    js.Function1[
      /* hasKeychain */ Keychain, 
      js.Function3[
        /* oldName */ js.UndefOr[_], 
        /* newName */ js.UndefOr[_], 
        /* options */ js.UndefOr[_], 
        js.Promise[Now]
      ]
    ]
  ] = js.native
  
  var rm: ReturnType[FnCallHasRmAll] = js.native
}
object Key_ {
  
  @scala.inline
  def apply(
    export: ReturnType[
      js.Function1[
        /* hasKeychain */ Keychain, 
        js.Function3[/* name */ js.UndefOr[_], /* password */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
      ]
    ],
    gen: ReturnType[
      js.Function1[
        /* hasKeychain */ Keychain, 
        js.Function2[/* name */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
      ]
    ],
    `import`: ReturnType[
      js.Function1[
        /* hasKeychain */ Keychain, 
        js.Function4[
          /* name */ js.UndefOr[_], 
          /* pem */ js.UndefOr[_], 
          /* password */ js.UndefOr[_], 
          /* options */ js.UndefOr[_], 
          _
        ]
      ]
    ],
    info: ReturnType[
      js.Function1[
        /* hasKeychain */ Keychain, 
        js.Function2[/* name */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
      ]
    ],
    list: ReturnType[FnCallHasKeychain],
    rename: ReturnType[
      js.Function1[
        /* hasKeychain */ Keychain, 
        js.Function3[
          /* oldName */ js.UndefOr[_], 
          /* newName */ js.UndefOr[_], 
          /* options */ js.UndefOr[_], 
          js.Promise[Now]
        ]
      ]
    ],
    rm: ReturnType[FnCallHasRmAll]
  ): Key_ = {
    val __obj = js.Dynamic.literal(export = export.asInstanceOf[js.Any], gen = gen.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], rm = rm.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key_]
  }
  
  @scala.inline
  implicit class Key_Ops[Self <: Key_] (val x: Self) extends AnyVal {
    
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
    def setExport(
      value: ReturnType[
          js.Function1[
            /* hasKeychain */ Keychain, 
            js.Function3[/* name */ js.UndefOr[_], /* password */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
          ]
        ]
    ): Self = this.set("export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGen(
      value: ReturnType[
          js.Function1[
            /* hasKeychain */ Keychain, 
            js.Function2[/* name */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
          ]
        ]
    ): Self = this.set("gen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(
      value: ReturnType[
          js.Function1[
            /* hasKeychain */ Keychain, 
            js.Function4[
              /* name */ js.UndefOr[_], 
              /* pem */ js.UndefOr[_], 
              /* password */ js.UndefOr[_], 
              /* options */ js.UndefOr[_], 
              _
            ]
          ]
        ]
    ): Self = this.set("import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(
      value: ReturnType[
          js.Function1[
            /* hasKeychain */ Keychain, 
            js.Function2[/* name */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
          ]
        ]
    ): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: ReturnType[FnCallHasKeychain]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRename(
      value: ReturnType[
          js.Function1[
            /* hasKeychain */ Keychain, 
            js.Function3[
              /* oldName */ js.UndefOr[_], 
              /* newName */ js.UndefOr[_], 
              /* options */ js.UndefOr[_], 
              js.Promise[Now]
            ]
          ]
        ]
    ): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRm(value: ReturnType[FnCallHasRmAll]): Self = this.set("rm", value.asInstanceOf[js.Any])
  }
}
