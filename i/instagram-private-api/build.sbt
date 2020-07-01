organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.40.1-ce7d40"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200520Z-17bf41",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-cf4980",
  "org.scalablytyped" %%% "chance" % "1.1-dt-20200515Z-e90292",
  "org.scalablytyped" %%% "form-data" % "3.0.0-8eb457",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-e1a46c",
  "org.scalablytyped" %%% "luxon" % "1.24-dt-20200623Z-90b2d6",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-9257df",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-51c44e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-9cdce8",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200515Z-facccb",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-2545f2",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-a87d31",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-1070c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
