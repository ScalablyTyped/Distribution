organization := "org.scalablytyped"
name := "http-rx"
version := "2.0-dt-20190113Z-73e3f8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "form-data" % "3.0.0-c2310a",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-146f98",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-f8c277",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-708450",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200331Z-3578e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
