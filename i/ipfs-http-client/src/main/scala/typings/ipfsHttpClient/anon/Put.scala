package typings.ipfsHttpClient.anon

import typings.cids.mod.^
import typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions
import typings.ipfsHttpClient.interfaceMod.WithExtendedOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Put extends StObject {
  
  def get(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithExtendedOptions<Parameters<API>, Extra> is not an array type */ args: WithExtendedOptions[
      Parameters[
        js.Function2[
          /* ipfsPath */ ^, 
          /* options */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
          ], 
          js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
          ]
        ]
      ], 
      HttpOptions
    ]
  ): ReturnType[
    js.Function2[
      /* ipfsPath */ ^, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
      ]
    ]
  ]
  @JSName("get")
  var get_Original: APIWithExtraOptions[
    js.Function2[
      /* ipfsPath */ ^, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
      ]
    ], 
    HttpOptions
  ]
  
  def put(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithExtendedOptions<Parameters<API>, Extra> is not an array type */ args: WithExtendedOptions[
      Parameters[
        js.Function2[
          /* dagNode */ js.Any, 
          /* options */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
          ], 
          js.Promise[^]
        ]
      ], 
      HttpOptions
    ]
  ): ReturnType[
    js.Function2[
      /* dagNode */ js.Any, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
      ], 
      js.Promise[^]
    ]
  ]
  @JSName("put")
  var put_Original: APIWithExtraOptions[
    js.Function2[
      /* dagNode */ js.Any, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
      ], 
      js.Promise[^]
    ], 
    HttpOptions
  ]
  
  def resolve(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithExtendedOptions<Parameters<API>, Extra> is not an array type */ args: WithExtendedOptions[
      Parameters[
        js.Function2[
          /* ipfsPath */ String | ^, 
          /* options */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
          ], 
          js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
          ]
        ]
      ], 
      HttpOptions
    ]
  ): ReturnType[
    js.Function2[
      /* ipfsPath */ String | ^, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
      ]
    ]
  ]
  @JSName("resolve")
  var resolve_Original: APIWithExtraOptions[
    js.Function2[
      /* ipfsPath */ String | ^, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
      ]
    ], 
    HttpOptions
  ]
}
object Put {
  
  @scala.inline
  def apply(
    get: /* args */ WithExtendedOptions[
      Parameters[
        js.Function2[
          /* ipfsPath */ ^, 
          /* options */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
          ], 
          js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
          ]
        ]
      ], 
      HttpOptions
    ] => ReturnType[
      js.Function2[
        /* ipfsPath */ ^, 
        /* options */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
        ], 
        js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
        ]
      ]
    ],
    put: /* args */ WithExtendedOptions[
      Parameters[
        js.Function2[
          /* dagNode */ js.Any, 
          /* options */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
          ], 
          js.Promise[^]
        ]
      ], 
      HttpOptions
    ] => ReturnType[
      js.Function2[
        /* dagNode */ js.Any, 
        /* options */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
        ], 
        js.Promise[^]
      ]
    ],
    resolve: /* args */ WithExtendedOptions[
      Parameters[
        js.Function2[
          /* ipfsPath */ String | ^, 
          /* options */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
          ], 
          js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
          ]
        ]
      ], 
      HttpOptions
    ] => ReturnType[
      js.Function2[
        /* ipfsPath */ String | ^, 
        /* options */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
        ], 
        js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
        ]
      ]
    ]
  ): Put = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction1(put), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Put]
  }
  
  @scala.inline
  implicit class PutMutableBuilder[Self <: Put] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(
      value: /* args */ WithExtendedOptions[
          Parameters[
            js.Function2[
              /* ipfsPath */ ^, 
              /* options */ js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
              ], 
              js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
              ]
            ]
          ], 
          HttpOptions
        ] => ReturnType[
          js.Function2[
            /* ipfsPath */ ^, 
            /* options */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
            ], 
            js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.DagEntry */ js.Any
            ]
          ]
        ]
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(
      value: /* args */ WithExtendedOptions[
          Parameters[
            js.Function2[
              /* dagNode */ js.Any, 
              /* options */ js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
              ], 
              js.Promise[^]
            ]
          ], 
          HttpOptions
        ] => ReturnType[
          js.Function2[
            /* dagNode */ js.Any, 
            /* options */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_put.PutOptions */ js.Any
            ], 
            js.Promise[^]
          ]
        ]
    ): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(
      value: /* args */ WithExtendedOptions[
          Parameters[
            js.Function2[
              /* ipfsPath */ String | ^, 
              /* options */ js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
              ], 
              js.Promise[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
              ]
            ]
          ], 
          HttpOptions
        ] => ReturnType[
          js.Function2[
            /* ipfsPath */ String | ^, 
            /* options */ js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveOptions */ js.Any
            ], 
            js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveResult */ js.Any
            ]
          ]
        ]
    ): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
