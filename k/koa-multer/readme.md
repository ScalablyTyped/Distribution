
# Scala.js typings for koa-multer

Typings are for version 1.0

## Library description:
Middleware for handling `multipart/form-data` for koa.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | koa-multer |
| Keywords           | form, post, multipart, form-data, formdata, koa, middleware |
| # releases         | 2 |
| # dependents       | 62 |
| # downloads        | 243008 |
| # stars            | 4 |

## Links
- [Homepage](https://github.com/koa-modules/multer#readme)
- [Bugs](https://github.com/koa-modules/multer/issues)
- [Repository](https://github.com/koa-modules/multer)
- [Npm](https://www.npmjs.com/package/koa-multer)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for koa-multer 1.0
// Project: https://github.com/koa-modules/multer
// Definitions by: benstevens48 <https://github.com/benstevens48>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.6
/**
 * @file
 * These definitions are based on the type definitions for multer - https://github.com/expressjs/multer - found on DefinitelyTyped.
 *
 * Note that it is necessary to explicitly cast the `Context.req` object to type `multer.MulterIncomingMessage`
 * to get the correct type for the patched `Context.req` object, as in the following example.
 * ```ts
 * import * as Koa from 'koa';
 * import * as Router from 'koa-router';
 * import * as multer from 'koa-multer';
 *
 * async function uploadFile(ctx: Koa.Context){
 *     let multerReq = <multer.MulterIncomingMessage>ctx.req;
 *     let files = multerReq.files;
 *     let baseFilePath: string = ctx.params.path || '';
 *     //...
 * }
 *
 * let router = new Router();
 * router.put('/uploads/:path?', upload.array('files'), uploadFile);
 * ```
 * The type cast is necessary since the type definitions for Koa do not allow for the `Context.req` property to be extended.
 */


```

