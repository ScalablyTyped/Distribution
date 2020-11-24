package typings.ipfsCore.filesMod

import typings.ipfsCore.anon.IpldIPLD
import typings.ipfsCore.chmodMod.ChmodOptions
import typings.ipfsCore.cpMod.CpOptions
import typings.ipfsCore.filesRmMod.RmOptions
import typings.ipfsCore.filesStatMod.Stat
import typings.ipfsCore.filesStatMod.StatOptions
import typings.ipfsCore.lsMod.UnixFSEntry
import typings.ipfsCore.mkdirMod.MkdirOptions
import typings.ipfsCore.mvMod.MvOptions
import typings.ipfsCore.readMod.ReadOptions
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.touchMod.TouchOptions
import typings.ipfsCore.writeMod.WriteOptions
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.ReturnType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MFS extends js.Object {
  
  var chmod: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function3[
        /* path */ String, 
        /* mode */ String | Double, 
        /* options */ js.UndefOr[ChmodOptions with AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var cp: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function1[
        /* args */ (js.Tuple2[String | typings.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple3[String | typings.cids.mod.^ , String | typings.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple4[
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple5[
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple6[
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple7[
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple8[
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]) | (js.Tuple9[
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          String | typings.cids.mod.^ , 
          js.UndefOr[CpOptions]
        ]), 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var flush: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[AbortOptions], 
        js.Promise[typings.cids.mod.^]
      ]
    ]
  ] = js.native
  
  var ls: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[AbortOptions], 
        AsyncIterable[UnixFSEntry]
      ]
    ]
  ] = js.native
  
  var mkdir: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[MkdirOptions with AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var mv: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function1[
        /* args */ (js.Tuple3[String, String, js.UndefOr[MvOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple10[String, String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]), 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var read: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String | typings.cids.mod.^ , 
        /* options */ js.UndefOr[ReadOptions with AbortOptions], 
        AsyncIterable[Uint8Array]
      ]
    ]
  ] = js.native
  
  var rm: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function1[
        /* args */ (js.Tuple2[String, js.UndefOr[RmOptions]]) | (js.Tuple3[String, String, js.UndefOr[RmOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]), 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var stat: ReturnType[
    js.Function1[
      /* context */ IpldIPLD, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[StatOptions with AbortOptions], 
        js.Promise[Stat]
      ]
    ]
  ] = js.native
  
  var touch: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[TouchOptions with AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var write: ReturnType[
    js.Function1[
      /* context */ _, 
      js.Function3[
        /* path */ String, 
        /* content */ String | Uint8Array | AsyncIterable[Uint8Array] | Blob, 
        /* options */ js.UndefOr[WriteOptions with AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
}
object MFS {
  
  @scala.inline
  def apply(
    chmod: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function3[
          /* path */ String, 
          /* mode */ String | Double, 
          /* options */ js.UndefOr[ChmodOptions with AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ],
    cp: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function1[
          /* args */ (js.Tuple2[String | typings.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple3[String | typings.cids.mod.^ , String | typings.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple4[
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple5[
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple6[
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple7[
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple8[
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]) | (js.Tuple9[
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            String | typings.cids.mod.^ , 
            js.UndefOr[CpOptions]
          ]), 
          js.Promise[Unit]
        ]
      ]
    ],
    flush: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[AbortOptions], 
          js.Promise[typings.cids.mod.^]
        ]
      ]
    ],
    ls: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[AbortOptions], 
          AsyncIterable[UnixFSEntry]
        ]
      ]
    ],
    mkdir: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[MkdirOptions with AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ],
    mv: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function1[
          /* args */ (js.Tuple3[String, String, js.UndefOr[MvOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple10[String, String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]), 
          js.Promise[Unit]
        ]
      ]
    ],
    read: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String | typings.cids.mod.^ , 
          /* options */ js.UndefOr[ReadOptions with AbortOptions], 
          AsyncIterable[Uint8Array]
        ]
      ]
    ],
    rm: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function1[
          /* args */ (js.Tuple2[String, js.UndefOr[RmOptions]]) | (js.Tuple3[String, String, js.UndefOr[RmOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]), 
          js.Promise[Unit]
        ]
      ]
    ],
    stat: ReturnType[
      js.Function1[
        /* context */ IpldIPLD, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[StatOptions with AbortOptions], 
          js.Promise[Stat]
        ]
      ]
    ],
    touch: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function2[
          /* path */ String, 
          /* options */ js.UndefOr[TouchOptions with AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ],
    write: ReturnType[
      js.Function1[
        /* context */ _, 
        js.Function3[
          /* path */ String, 
          /* content */ String | Uint8Array | AsyncIterable[Uint8Array] | Blob, 
          /* options */ js.UndefOr[WriteOptions with AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ]
  ): MFS = {
    val __obj = js.Dynamic.literal(chmod = chmod.asInstanceOf[js.Any], cp = cp.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], ls = ls.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], mv = mv.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], rm = rm.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[MFS]
  }
  
  @scala.inline
  implicit class MFSOps[Self <: MFS] (val x: Self) extends AnyVal {
    
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
    def setChmod(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function3[
              /* path */ String, 
              /* mode */ String | Double, 
              /* options */ js.UndefOr[ChmodOptions with AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("chmod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCp(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function1[
              /* args */ (js.Tuple2[String | typings.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple3[String | typings.cids.mod.^ , String | typings.cids.mod.^ , js.UndefOr[CpOptions]]) | (js.Tuple4[
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple5[
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple6[
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple7[
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple8[
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]) | (js.Tuple9[
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                String | typings.cids.mod.^ , 
                js.UndefOr[CpOptions]
              ]), 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("cp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlush(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[AbortOptions], 
              js.Promise[typings.cids.mod.^]
            ]
          ]
        ]
    ): Self = this.set("flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLs(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[AbortOptions], 
              AsyncIterable[UnixFSEntry]
            ]
          ]
        ]
    ): Self = this.set("ls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMkdir(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[MkdirOptions with AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("mkdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMv(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function1[
              /* args */ (js.Tuple3[String, String, js.UndefOr[MvOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]) | (js.Tuple10[String, String, String, String, String, String, String, String, String, js.UndefOr[MvOptions]]), 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("mv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String | typings.cids.mod.^ , 
              /* options */ js.UndefOr[ReadOptions with AbortOptions], 
              AsyncIterable[Uint8Array]
            ]
          ]
        ]
    ): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRm(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function1[
              /* args */ (js.Tuple2[String, js.UndefOr[RmOptions]]) | (js.Tuple3[String, String, js.UndefOr[RmOptions]]) | (js.Tuple4[String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple5[String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple6[String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple7[String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple8[String, String, String, String, String, String, String, js.UndefOr[RmOptions]]) | (js.Tuple9[String, String, String, String, String, String, String, String, js.UndefOr[RmOptions]]), 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("rm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(
      value: ReturnType[
          js.Function1[
            /* context */ IpldIPLD, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[StatOptions with AbortOptions], 
              js.Promise[Stat]
            ]
          ]
        ]
    ): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function2[
              /* path */ String, 
              /* options */ js.UndefOr[TouchOptions with AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(
      value: ReturnType[
          js.Function1[
            /* context */ _, 
            js.Function3[
              /* path */ String, 
              /* content */ String | Uint8Array | AsyncIterable[Uint8Array] | Blob, 
              /* options */ js.UndefOr[WriteOptions with AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("write", value.asInstanceOf[js.Any])
  }
}
