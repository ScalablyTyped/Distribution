package typings.ipfsHttpClient.anon

import typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions
import typings.ipfsHttpClient.interfaceMod.WithExtendedOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAll extends StObject {
  
  def get(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithExtendedOptions<Parameters<API>, Extra> is not an array type */ args: WithExtendedOptions[
      Parameters[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Get */ js.Any
      ], 
      HttpOptions
    ]
  ): ReturnType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Get */ js.Any
  ]
  
  def getAll(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithExtendedOptions<Parameters<API>, Extra> is not an array type */ args: WithExtendedOptions[
      Parameters[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any
      ], 
      HttpOptions
    ]
  ): ReturnType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any
  ]
  @JSName("getAll")
  var getAll_Original: APIWithExtraOptions[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any, 
    HttpOptions
  ]
  
  @JSName("get")
  var get_Original: APIWithExtraOptions[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Get */ js.Any, 
    HttpOptions
  ]
  
  var profiles: Apply
  
  def replace(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithExtendedOptions<Parameters<API>, Extra> is not an array type */ args: WithExtendedOptions[
      Parameters[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Replace */ js.Any
      ], 
      HttpOptions
    ]
  ): ReturnType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Replace */ js.Any
  ]
  @JSName("replace")
  var replace_Original: APIWithExtraOptions[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Replace */ js.Any, 
    HttpOptions
  ]
  
  def set(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithExtendedOptions<Parameters<API>, Extra> is not an array type */ args: WithExtendedOptions[
      Parameters[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Set */ js.Any
      ], 
      HttpOptions
    ]
  ): ReturnType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Set */ js.Any
  ]
  @JSName("set")
  var set_Original: APIWithExtraOptions[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Set */ js.Any, 
    HttpOptions
  ]
}
object GetAll {
  
  inline def apply(
    get: /* args */ WithExtendedOptions[
      Parameters[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Get */ js.Any
      ], 
      HttpOptions
    ] => ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Get */ js.Any
    ],
    getAll: /* args */ WithExtendedOptions[
      Parameters[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any
      ], 
      HttpOptions
    ] => ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any
    ],
    profiles: Apply,
    replace: /* args */ WithExtendedOptions[
      Parameters[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Replace */ js.Any
      ], 
      HttpOptions
    ] => ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Replace */ js.Any
    ],
    set: /* args */ WithExtendedOptions[
      Parameters[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Set */ js.Any
      ], 
      HttpOptions
    ] => ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Set */ js.Any
    ]
  ): GetAll = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), profiles = profiles.asInstanceOf[js.Any], replace = js.Any.fromFunction1(replace), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[GetAll]
  }
  
  extension [Self <: GetAll](x: Self) {
    
    inline def setGet(
      value: /* args */ WithExtendedOptions[
          Parameters[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Get */ js.Any
          ], 
          HttpOptions
        ] => ReturnType[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Get */ js.Any
        ]
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAll(
      value: /* args */ WithExtendedOptions[
          Parameters[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any
          ], 
          HttpOptions
        ] => ReturnType[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.GetAll */ js.Any
        ]
    ): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
    
    inline def setProfiles(value: Apply): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setReplace(
      value: /* args */ WithExtendedOptions[
          Parameters[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Replace */ js.Any
          ], 
          HttpOptions
        ] => ReturnType[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Replace */ js.Any
        ]
    ): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
    
    inline def setSet(
      value: /* args */ WithExtendedOptions[
          Parameters[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Set */ js.Any
          ], 
          HttpOptions
        ] => ReturnType[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Set */ js.Any
        ]
    ): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
