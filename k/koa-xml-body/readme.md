```
// Type definitions for koa-xml-body 2.0
// Project: https://github.com/creeperyang/koa-xml-body
// Definitions by: Ulf Winkelvos <https://github.com/uwinkelvos>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.3
/* =================== USAGE ===================

	import Koa = require('koa');
	import KoaXmlBody = require('koa-xml-body');

	const app = new Koa();
	app.use(KoaXmlBody({
		onerror: (err, ctx) => {
			ctx.throw(err.message);
		}
	}));

 =============================================== */

```