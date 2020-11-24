organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.43.3-9385f7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8be3cf",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-911575",
  "org.scalablytyped" %%% "chance" % "1.1-dt-20200515Z-185b19",
  "org.scalablytyped" %%% "form-data" % "3.0.0-8c69ed",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-cc4ebe",
  "org.scalablytyped" %%% "luxon" % "1.25-dt-20200918Z-998e2d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-989d2d",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-8d21ff",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-af84f1",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-f8d115",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-e6e9fe",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-3abd01",
  "org.scalablytyped" %%% "utility-types" % "3.10.0-2c49a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
