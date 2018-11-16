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